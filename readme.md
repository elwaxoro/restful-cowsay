# Restful Cowsay

I wanted to write something simple in Spark, so why not Cowsay?

## Build & Run
```
sbt clean compile run
```
Open a browser and head over to:
[localhost:4567](http://localhost:4567)

## Usage
Use the say endpoint for cowsay via restful parameters:
[HI MOM!](http://localhost:4567/say?msg=Hi%20Mom!)

A partial set of the cowsay arguments are supported.
Mix and match the following:

* cowthink (say?cowthink&msg=...)
* -f cowfile (say?f=tux&msg=...)
