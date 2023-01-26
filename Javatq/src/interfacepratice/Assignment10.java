package interfacepratice;
/*Write MusicalInstrument interface with play method. It also has common 
behavior (static) learnInstrument. Create Abstract class Sound with abstract 
method listenSound.Implement MusicalInstrument interface in 
PercussionInstrument and StringedInstrument classes.Also extend Sound class 
in both classes.Create object ‘Tabla’ of PercussionInstrument class and object 
‘Violin’ of StringedInstrument class.call Paly, learnInstrument and listenSound 
methods of both objects*/


 interface MusicalInstrument{
	 void play();
	 
	 static void  learnInstrument() {
		 System.out.println("learning instruments");
		 
		 
	 }
	 
 }
 abstract class  Sound   {
	 abstract void listensound();
 }
 
 
class PercussionInstrument extends Sound   implements MusicalInstrument {

	@Override
	public void play() {
		System.out.println("playing PercussionInstrument.... ");
		
	}

	@Override
	void listensound() {
		System.out.println("listening sound.... ");
		
	}
	
}



class StringedInstrument extends Sound implements MusicalInstrument{

	@Override
	public void play() {
		
		System.out.println("playing StringedInstrument .... ");
	}

	@Override
	void listensound() {
		System.out.println("listening sound.... ");
		
	}
	
}




public class Assignment10 {

	public static void main(String[] args) {
		
		PercussionInstrument tabla = new PercussionInstrument();
		tabla.play();
		tabla.listensound();
		StringedInstrument Violin=new  StringedInstrument ();
		Violin.play();
		Violin.listensound();
		
		
	}

}
