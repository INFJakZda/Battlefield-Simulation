package battle.relogo

import static repast.simphony.relogo.Utility.*
import static repast.simphony.relogo.UtilityG.*

import battle.ReLogoTurtle
import repast.simphony.relogo.Plural
import repast.simphony.relogo.Stop
import repast.simphony.relogo.Utility
import repast.simphony.relogo.UtilityG
import repast.simphony.relogo.schedule.Go
import repast.simphony.relogo.schedule.Setup

class Tank extends ReLogoTurtle {
	
	def lifePoints = 100
	def attack = 10
	
	def step() {

		if (count(turtlesHere()) > 1) {
			def turtleChoosen = oneOf(turtlesHere())
			if(color == turtleChoosen.color) {
				label = lifePoints.toString()
				fd(1)
			}
			else {
				label = "FIGHT"
				fight(turtleChoosen)
			}
		}
		else {
			label = lifePoints.toString()
			fd(1)
		}
		if (lifePoints < 0) {
			die()
		}		
	}
	
	def fight(turtleChoosen) {
		turtleChoosen.lifePoints = turtleChoosen.lifePoints - attack
	}
}
