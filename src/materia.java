import java.util.Calendar;
        public abstract class materia{
            protected String name;
            protected Calendar c;
            protected  int d;

            public materia(String name, Calendar c, int d) {
                this.name = name;
                this.c = c;
                this.d = d;
            }

            public materia(String name, int year , int month, int day, int d){
                this.name=name;
                c.set(year,month,day);
                this.d=d;
            }

            public materia() {
            }
        }
