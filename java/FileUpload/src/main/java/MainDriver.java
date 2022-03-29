import io.javalin.Javalin;
import io.javalin.http.UploadedFile;
import io.javalin.http.staticfiles.Location;
import org.apache.commons.io.FileUtils;
import services.S3Service;

import java.io.File;

public class MainDriver {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.addStaticFiles("/", Location.CLASSPATH);
        }).start(9000);

        app.post("/upload", context -> {
            UploadedFile uploadedFile = context.uploadedFile("file");
            File file = new File("uploads/" + uploadedFile.getFilename());

            FileUtils.copyInputStreamToFile(uploadedFile.getContent(), file);


            S3Service s3Service = new S3Service();
            s3Service.uploadFile(file);

            context.result("/images/" + file.getName());

        });
    }
}
