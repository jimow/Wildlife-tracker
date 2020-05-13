# Wildlife-tracker
This is an app that allows you to track sightings of wildlife.

## Prerequisite
1. PostgreSQL
2. Java JDK
3. Gradle
4. Git
5. maven


## Setup Guide
##### PostgreSQL Installation
+ Run `sudo apt-get install postgresql postgresql-contrib libpq-dev` in the terminal to install PostgreSQL in your device.
+ Enter y when prompted `Do you want to continue? [Y/n]` and wait for the installation to complete.
+ Create your own credentials with superuser capabilities with the same name as our login name by running `sudo -u postgres createuser --superuser $USER`
+ Next, we’ll have to create a database with the same name as our login name by running `sudo -u postgres createdb $USER`
+ Finally run `psql` in the terminal to connect to the server
###### Structure
+ After running the `psql` command to connect to the server, proceed to create the database wildlife-tracker by executing the following command: `create database wildlife_tracker;`
+ Follow it up with this following command to connect to the newly created database`\c wildlife_tracker;`
+ Once connected

## Live App

https://wildlifetracker-12.herokuapp.com/
