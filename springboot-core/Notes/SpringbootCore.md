# Learning Dependency Injection
## Development Process -
1. Define the dependency interface and class
2. Create REST controller
3. Create a constructor in your class for injections
4. Add @GetMapping for /{endpoint}

## Constructor Injection
### Working - behind the scenes
* Behind the scenes, spring will create a new instance of Coach Class.
* It will perform constructor injection - pass instance to DemoController.

## Component Scanning
* Spring will scan Java Classes for Special annotations - @Component, etc
* Automatically register the beans in the Spring Container.
* @SpringBootApplication enables Auto Configuration, Component Scanning, Additional Configuration.
  * @SpringBootApplication Annotation comprises of:
    * @EnableAutoConfiguration - Enables SpringBoot's AutoConfiguration Support
    * @ComponentScan - Enables component scanning of Current Package & recursively scans sub-packages
    * @Configuration - Able to register extra beans with @Bean or import other configuration classes
