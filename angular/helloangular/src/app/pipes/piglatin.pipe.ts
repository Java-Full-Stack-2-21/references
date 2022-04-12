import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'piglatin'
})
export class PiglatinPipe implements PipeTransform {

  transform(word: string): string {
    return word.slice(1) + word.slice(0,1) + "ay";
  }

}
