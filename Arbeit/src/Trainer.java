public class Trainer {


        private String name;
        private int alter;
        private int erfahrung;

        public Trainer (String name, int alter, int erfahrung){
            this.name = name;
            this.alter = alter;
            this.erfahrung =erfahrung;
        }

        public String getName() {
            return this.name;
        }

        public int getAlter() {
            return this.alter;
        }

        public int getErfahrung() {
            return this.erfahrung;
        }

        public void setName (String name) {
            this.name = name;
        }

        public void setAlter(int alter){
            this.alter = alter;
        }


        public void setErfahrung(int erfahrung) {
            this.erfahrung = erfahrung;
        }


        public String toString(){
            String text;
            text = "Name:                  " + getName();
            text+= "\nAlter:                 " + getAlter();
            text+= "\nErfahrung:             " + getErfahrung();
            return text;
        }


    }


