## What is Normalization? 
   Normalization is a way of organizing data in a database that reduces data redundancy and improves consistency of the data


## Social Media Database

#### *SOCIAL MEDIA TABLE* (Is this table 'normalized'?)
name          | password | post          | following                 | zip_code | city    | like_count
:-------------|----------|---------------|---------------------------|----------|---------|-----------
kevin childs  | pass123  |  post message | afl21, chee212, apples54  | 12345    | Sydney  | 12

#### Why do we need to normalize?
   - How do we add another user in following?
      - We would have do an 'UPDATE' command and retype each user in the following column...
   - What if a user changed his name in the system?
   - What uniquely identifies this record? 
Normalization solves all of these issues


## How we do we begin structuring this table to be normalized?
There are steps we can take called normal forms to get to a normalized table

## Normal Forms
   - 1st NF
   - 2nd NF
   - 3rd NF
   - etc... we are only going to be talking about the first three

## 1st Normal Form:
 - Each cell to be single valued
 - Rows are uniquely identified (UID)
    
### We are going to convert table above into 1NF 

id     |username  |name          | password | post          | following   | zip_code  | city    | like_count|
:------|----------|--------------|----------|---------------|-------------|-----------|---------|-----------|
**1**  | kchi292  | kevin childs | pass123  |  post message | afl21       |   12345   | Sydney  | 12 	    |			      
**2**  | kchi292  | kevin childs | pass123  |  post message | chee212     |   12345   | Sydney  | 12	    |
**3**  | kchi292  | kevin childs | pass123  |  post message | apples54    |   12345   | Sydney  | 12        |


## 2nd Normal Form:
 - be in 1NF
 - all attributes are dependent on the key
    
### We are going to convert table above into 2NF 

#### *USER TABLE*
user_id     |username  |name          | password | zip_code  | city
:-----------|----------|--------------|----------|-----------|-------    
**1**       | kchi292  | kevin childs | pass123  |   12345   | Sydney
**2**       | afl21    | Alfred Smith | pass123  |   23456   | Arlington
**3**       | chee212  | Chester Sale | pass123  |   12345   | Dallas
**4**       | apples54 |Hakeem Kennedy| pass123  |   12345   | Grand Prarie


#### *FOLLOWING TABLE*
user_id_fk  | following_id_fk
:-----------|----------
**1**       | **2**
**1**       | **3**
**1**       | **4**

#### *POST TABLE*
post_id     |user_id_fk    | post	       	    | like_count
:-----------|--------------|------------------------|------------
**1**       | 1            | post message           |12
**2**       | 1            | another post message   |5
**3**       | 1            | third post message     |7

## 3rd Normal Form:
 - be in 2NF
 - no transitive values
      HINT: you have a transitive value if changing a non-key column might change another non-key column
    
### We are going to convert table above into 3NF

#### *USER TABLE*
user_id     |username  |name          | password | location_id 
:-----------|----------|--------------|----------|-----------
**1**       | kchi292  | kevin childs | pass123  |   1


#### *FOLLOWING TABLE*
user_id_fk     | following
:-----------   |----------
**1**          | **2**
**1**          | **3**
**1**          | **4**

#### *POST TABLE*
post_id     |user_id_fk    | post	       	    | like_count
:-----------|--------------|------------------------|------------
**1**       | 1            | post message           |12
**2**       | 1            | another post message   |5
**3**       | 1            | third post message     |7

#### *LOCATION TABLE*
location_id | zip_code | city        | state | country
:-----------|----------|-------------|-------|--------
**1**       | 12345    | normal_town | Texas | United States



## RECAP: First Three Normal Forms:
   - 1st Normal Form: 
      - Each cell to be single valued
      - Rows are uniquely identified (UID)
   - 2nd Normal Form:
      - Must be in 1st normal form
      - all attributes are dependent on the key
   - 3rd Normal Form:
      - Must be in 2nd normal form
      - no transitive values
         HINT: you have a transitive value if changing a non-key column might change another non-key column