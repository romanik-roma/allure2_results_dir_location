# allure2_results_dir_location
Run command
`$ mvn clean test`
and find that the `allure-results` directory is generated not in the `target` directory, but in the root directory of the project.

Run command
`$ mvn clean test allure:report`
and find the error of type:

[ERROR] Directory E:\workspace\project_name\target\allure-results not found.
