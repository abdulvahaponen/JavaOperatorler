
public class Operatorler {
public static void main(String[] args) {
	int deger1=33;
	int deger2=12;
	int toplama=deger1+deger2;
	int cikarma=deger1-deger2;
	int carpma=deger1*deger2;
	int bolme=deger1/deger2;
	System.out.println("toplama sonuc:"+toplama);
	System.out.println("��karma sonuc:"+cikarma);
	System.out.println("carpma sonuc:"+carpma);
	System.out.println("bolme sonuc:"+bolme);
	Operatorler operatorler=new Operatorler();
	operatorler.tekliOperator();
	operatorler.iliskiselOperator();
	operatorler.kosulOperatorleri();
}
public void kosulOperatorleri() {
	int deger1=2;
	int deger2=4;
	String strDeger1="mobilhanem.com";
	String strDeger2="mobilhanem";
	if ((deger1<deger2)&&(strDeger1.contains(strDeger2))) {
		System.out.println(deger1+"k���kt�r"+deger2
			+"ve"+strDeger1+" "+strDeger2+"string degerini i�erir"	);
	}
	if ((deger1==deger2)||(strDeger1.contains(strDeger2))) {
		System.out.println(deger1+"e�ittir"+deger2
				+"veya"+strDeger1+" "+strDeger2+"string egerini i�erir");
	}
	if ((deger1<deger2)||(strDeger1.contains(strDeger2))) {
		System.out.println(deger1+"k���kt�r"+deger2
				+"veya"+strDeger1+" "+strDeger2+"string de�erini i�erir");
	}
	int deger3=23;
	int deger4=(deger3==23)?24:22;
	System.out.println("deger4:"+deger4);
	deger4=(deger3==22)?24:22;
	System.out.println("deger4:"+deger4);
}

public void iliskiselOperator() {
	int deger1=32;
	int deger2=32;
	if (deger1==deger2) {
		System.out.println(deger1+"e�ttir"+deger2);
	}
	int deger3=32;
	int deger4=33;
	if (deger3!=deger4) {
		System.out.println(deger3+"e�it de��ldir"+deger4);
	}
	if (deger3<deger4) {
		System.out.println(deger3+"k���kt�r"+deger4);
	}
	if (deger3<=deger4) {
		System.out.println(deger3+"k���k veya e�ittir"+deger4);
	}
	int deger5=32;
	int deger6=12;
	if (deger5>deger6) {
		System.out.println(deger5+"b�y�kt�r"+deger6);
	}
	int deger7=13;
	int deger8=13;
	if (deger7>=deger8) {
		System.out.println(deger7+"b�y�k veya e�ittir"+deger8);
	}
}
public void tekliOperator() {
	int deger=+1;
	System.out.println("Deger:"+deger);
	deger=-deger;
	System.out.println("deger:"+deger);
	deger++;
	System.out.println("deger:"+deger);
	deger--;
	System.out.println("deger:"+deger);
	boolean durum=true;
	System.out.println("durum:"+durum);
	System.out.println("durum:"+durum);
	
}
//public void 
}
