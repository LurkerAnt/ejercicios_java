package teachermade001;

public class SwitchProfe {

	public static void main(String[] args) {
		
		string diaSemana;
		int dia;
		diaSemana= "miercoles";
		
		switch(diaSemana) {
		case "Lunes":
			dia = 1;
			break;
		case "Miercoles":
			dia = 3;
			break;
		default:
			dia = 0;			
			break;
		
		}
	}

}


/*
string diaSemana;
int dia;
diaSemana= "miercoles";
boolean laborable
switch(diaSemana) {
case "Lunes":
	dia = 1;
	break;
case "Miercoles":
	dia = 3;
	break;
default:
	dia = 0;			
	break;