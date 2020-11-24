package by.jrr.start;

public class LightColorDetector {
    public String detect(int wavelength) {
        String task;
        if(wavelength>=380 && wavelength<=449){
            task = "Violet";
        }else if(wavelength>=450 && wavelength<=494){
            task = "Blue";
        } else if(wavelength>=495 && wavelength<=569){
            task = "Green";
        }else if(wavelength>=570 && wavelength<=589){
            task = "Yellow";
        }else if(wavelength>=590 && wavelength<=619){
            task = "Orange";
        }else if(wavelength>=620 && wavelength<=750){
            task = "Red";
        }else {
            task = "Invisible Light";
        }return task;
    }
}
