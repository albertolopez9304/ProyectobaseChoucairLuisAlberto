
  @stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screamplay at the Choucair Academy with the automation course
    @scenario1
    Scenario Outline: Search for a automation course
      Given than brandon wants to learn automation at the academy Choucair
      | strUser     | strPassword     |
      | <strUser>   | <strPassword>   |

      
      When he search for the course on the choucair academy plataform
      | strCourse    |
      | <strCourse>  |
      
      Examples:
      Then he finds the course called resources
      | strUser     | strPassword    |  strCourse                      |
      | 1065000614  | Choucair2021*  |  ISTQB Agile Tester Extension   |
