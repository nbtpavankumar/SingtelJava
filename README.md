# SingtelJava
Interview Task for Singtel

-> High Level Design

Species
	Animals
		a. Birds
			i. 		ButterFly
			ii. 	Chicken
			iii.	Duck
			iv. 	Duck
			v. 		Parrot
			v1. 	Roaster
		b. Fish
			i. 		ClownFish
			ii.		Shark
		c. Insects
			i.		CaterPillar
		d. Mammals 
			i.		Cat
			ii.		Dog
			iii.	Dolphin

-> Bird, Fish , Insects , Mammals are abstract types.

-> Each Category was has their own implementation, for example: Cat, Dog, Dolphin for Mammals 

-> Fly, Sing, Swim, Walk are the behaviors which are specific to each category and more specific for category impl (Real objects like Parrot, Roaster)

-> Task can be be verified threw the test cases as below


Task					Test Case				Method

E.1.a				CountTest.java				test_fly_count()
E.1.b				CountTest.java				test_walk_count()
E.1.c				CountTest.java				test_sing_count()
E.1.d				CountTest.java				test_swim_count()


D.1.a				ButterflyTest				test_behaviour()
D.1.b				ButterflyTest				test_behaviour()

D.2.a				CaterPillarTest				test_behaviour()
D.2.b				CaterPillarTest				test_behaviour()


B.1.a				Fish.java					<an abstract-so no test case>
B.1.b				Fish.java					<an abstract-so no test case>
B.1.c				Fish.java					<an abstract-so no test case>

B.2.a				SharkTest.java				test_behaviour()
B.2.b				ClownFishTest.java			test_behaviour()
B.2.c				ClownFishTest.java			test_behaviour()

B.3					Dolphin.java

A.1.a				Designed respectively
A.1.b				Test cases are implemented accordingly

A.2.a				DuckTest					test_behaviour()
A.2.b				DuckTest					test_behaviour()
A.2.c				ChickenTest					test_behaviour()
A.2.d				ChickenTest					test_behaviour()
	
A.3.a				RoosterTest					test_behaviour()
A.3.b				RoosterTest					test_behaviour()
					
A.4.a				ParrotTest					test_parrot_with_mamal_dog_neighbour()
A.4.b				ParrotTest					test_parrot_with_mamal_cat_neighbour()


----------------------------------------------------------------------------------------------------

											THANK YOU
----------------------------------------------------------------------------------------------------