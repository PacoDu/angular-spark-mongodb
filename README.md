# AngularJS Sparkjava MongoDB archetype
This repo is a ready to go archetype front-end and back-end to built webapp using AngularJS Sparkjava and MongoDB.


## Requirements

In order to take part in this project you will need to have Node.js, MongoDB and IntelliJ IDEA. 

## Deployement from git

#### Step 1
Run the following cmd to deploy sources, install dependencies and initialize a git repo.
```
git clone git@github.com:PacoDu/angular-spark-mongodb.git
cd friends
git init
sudo npm install && bower install && grunt
```

#### Step 2
1. Import project with IntelliJ as gradle project.
2. Right click on src/ folder and Mark as source folder.
3. Make project.
4. Edit run/debug configuration, add an Application and target main class spark.

### Step 3
To import data in mongodb use `mongoimport --db DBNAME --collection MODEL --file data/data_sample/DATA.json --jsonArray`.

## Build & development

#### AngularJS
Run `grunt` for building and `grunt serve` for preview. 
Node.js server listen on `http://localhost:9000`.

#### Sparkjava
Run from IntelliJ to start server.
Jetty server listen on `http://localhost:8080`.

#### MongoDB
Run `mongod -dbpath absolutePathTo/data/db`.

## Testing

Running `grunt test` will run the unit tests with karma.
