package by.jrr.start;

public class LightColorDetector {

        public String detect(int wavelength){
            String answer;

            if (wavelength >= 380 && wavelength <= 449){
                answer = "Violet";
            }else if (wavelength >= 450 && wavelength <= 494){
                answer = "Blue";
            }else if (wavelength >= 495 && wavelength <= 569){
                answer = "Green";
            }else if (wavelength >= 570 && wavelength <= 589){
                answer = "Yellow";
            }else if (wavelength >= 590 && wavelength <= 619){
                answer = "Orange";
            }else if (wavelength >= 620 && wavelength <= 750){
                answer = "Red";
            }else {
                answer = "Invisible Light";
            }
            return answer;
        }
}