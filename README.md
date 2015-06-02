# friends

This project is generated with [yo angular generator](https://github.com/yeoman/generator-angular)
version 0.11.1.

## Requirements

In order to take part in this project you will only need to have `npm`, `bower`, `gradle` and IntelliJ IDEA. 

## Deployement from git

#### Step 1
Run `git clone git@github.com:PacoDu/friends.git && cd friends && git init && sudo npm install && bower install && grunt` to deploy sources, install dependencies and initialize the git repo.

#### Step 2
1. Import project with IntelliJ as gradle project.
2. Right click on src/ folder and Mark as source folder.
3. Make project.
4. Edit run/debug configuration, add an Application and target main class spark.

## Build & development

#### AngularJS
Run `grunt` for building and `grunt serve` for preview.

#### Sparkjava
Run from IntelliJ to start server.

#### MongoDB
Run `mongod -dbpath absolutePathTo/data/db`.

## Testing

Running `grunt test` will run the unit tests with karma.
