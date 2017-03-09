package groovyLearning


class BasicsGroovy {

	static main(args) {
		
		println "Welcome Groovy";
		
		/*for(def i=1;i<=8;i++){
			
			println(i%2);
			if(i%2){
				
				println i +"=true"
			}
			else
				println i+"=false"
			
		}*/
		
		//Strings
		
		def str="GroovyLearn";
		def str1="$str Test";		
		println(str1);
		str1='$str Test';
		println(str1);
	    def multiLine='''Test
	Test2'''
		
		println multiLine;
	
	//Access a string by index
		println("String Index :"+str[1]);
		println(" Index Of:"+str.indexOf('v'));
		
   //Get a slice 
		
	  println("1st 4 characters " +str[0..3]);
		
		
	

	}
}