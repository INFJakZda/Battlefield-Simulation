package battle.relogo

import static repast.simphony.relogo.Utility.*;
import static repast.simphony.relogo.UtilityG.*;

import org.apache.poi.hssf.util.HSSFColor.PINK

import repast.simphony.relogo.Stop;
import repast.simphony.relogo.Utility;
import repast.simphony.relogo.UtilityG;
import repast.simphony.relogo.schedule.Go;
import repast.simphony.relogo.schedule.Setup;
import battle.ReLogoObserver;

class UserObserver extends ReLogoObserver{

	/**
	 * Add observer methods here. For example:

		@Setup
		def setup(){
			clearAll()
			createTurtles(10){
				forward(random(10))
			}
		}
		
	 *
	 * or
	 * 	
	
		@Go
		def go(){
			ask(turtles()){
				left(random(90))
				right(random(90))
				forward(random(10))
			}
		}

	 */
	@Setup
	def setup() {
		clearAll()
		setDefaultShape(Tank, "truck")
		createTanks(numTanks){
			double x = randomXcor()
			if (x > 0) {
				x = -x
			}
			setxy(x,randomYcor())
			size = 2
			color = blue()
		}
		createTanks(numTanks){
			double x = randomXcor()
			if (x < 0) {
				x = -x
			}
			setxy(x,randomYcor())
			size = 2
			color = red()
		}
	}
	
	
	@Go
	def go(){
		
		ask (tanks()){
			step()
		}
		
		if (emptyQ(tanks())){
			stop()
			// Could choose to pause as well.
			// pause()
		}
		
	}
	
	def remainingTanks(){
		count(tanks())
	}

}