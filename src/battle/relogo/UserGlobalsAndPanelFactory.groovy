package battle.relogo

import repast.simphony.relogo.factories.AbstractReLogoGlobalsAndPanelFactory

public class UserGlobalsAndPanelFactory extends AbstractReLogoGlobalsAndPanelFactory{
	public void addGlobalsAndPanelComponents(){
		
		/**
		 * Place custom panels and globals below, for example:
		 * 
	        addGlobal("globalVariable1")	// Globally accessible variable ( variable name)
	        // Slider with label ( variable name, slider label, minimum value, increment, maximum value, initial value )
	        addSliderWL("sliderVariable", "Slider Variable", 0, 1, 10, 5)
	        // Slider without label ( variable name, minimum value, increment, maximum value, initial value )
	        addSlider("sliderVariable2", 0.2, 0.1, 0.8, 0.5)
	        // Chooser with label  ( variable name, chooser label, list of choices , zero-based index of initial value )
	        addChooserWL("chooserVariable", "Chooser Variable", ["yes","no","maybe"], 2)
	        // Chooser without label  ( variable name, list of choices , zero-based index of initial value )
	        addChooser("chooserVariable2", [1, 66, "seven"], 0)
	        // State change button (method name in observer)
	        addStateChangeButton("change")
	        // State change button with label (method name in observer, label)
	        addStateChangeButtonWL("changeSomething","Change Something")
	        
		 */
		addSliderWL("numTanksBlue", "Number of blue Tanks", 0, 1, 20, 10)
		addSliderWL("numTanksRed", "Number of red Tanks", 0, 1, 20, 10)
		
		addSliderWL("numRidersBlue", "Number of blue riders", 0, 1, 20, 10)
		addSliderWL("numRidersRed", "Number of red riders", 0, 1, 20, 10)
		
		addSliderWL("numSoldierBlue", "Number of blue soldiers", 0, 1, 20, 10)
		addSliderWL("numSoldierRed", "Number of red soldiers", 0, 1, 20, 10)

		addMonitorWL("remainingTanksBlue", "Remaining Blue Tanks", 5)
		addMonitorWL("remainingSoldiersBlue", "Remaining Blue Soldiers", 5)
		addMonitorWL("remainingRidersBlue", "Remaining Blue Riders", 5)

		addMonitorWL("remainingTanksRed", "Remaining Red Tanks", 5)
		addMonitorWL("remainingSoldiersRed", "Remaining Red Soldiers", 5)
		addMonitorWL("remainingRidersRed", "Remaining Red Riders", 5)
	}
}