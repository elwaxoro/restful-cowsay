# Restful Cowsay

I wanted to write something simple in Spark, so why not Cowsay?

![in action](https://raw.githubusercontent.com/elwaxoro/restful-cowsay/master/demo.png)

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

## Credits and Shit

Based on the Spark demo by [kaiserleib](https://github.com/kaiserleib/hello-spark-sbt)  
Cowsay provided by [ricksbrown](https://github.com/ricksbrown/cowsay)
