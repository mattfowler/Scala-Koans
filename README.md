 # Scala Koans <img src="resources/scala.png" width="48">  

### Learning Scala by Example

Designed to work with later versions of Scala / SBT / Scalatest.

From: http://scalakoans.webfactional.com/

## Running the Koans

Once you run the koans you'll be presented with a failing test to make pass. Once you make the failing test pass you can move on to the next one.

### Using Docker

Simply run `docker-compose up`

### Using SBT

Ensure that you have Scala and SBT installed on your machine.  From the root project directory run:
 
 `sbt "~testOnly org.functionalkoans.forscala.Koans"`