## Development Process -
1. Define the dependency interface and class
2. Create REST controller


# Dependency Injection
## A. Constructor Injection
### Development Process - 
1. Create a constructor in your class for injections
2. Add @GetMapping for /{endpoint}

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

## B. Setter Injection
* Inject dependencies by calling setter methods on your class.
### Development Process - 
1. Create setter method(s) in class for injections
2. Configure the dependency injection with @Autowired Annotation

### Working - behind the scenes
* Spring will create the instance of CricketCoach
* Dev will create the instance of DemoController
* Using setter method, Dev passes the instance of the Coach Implementation
* The instance can be passed to any method that has @Autowired annotation.

## Usage 
### Constructor Injection
  * Use this when you have required dependencies
  * Generally recommended by the spring.io development team as first choice

### Setter Injection
  * Use this when you have optional dependencies, such that if dependency is not provided, your app can provide resonable default logic.


