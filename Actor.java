class Actor{
public static void act(String movName , String actor,String actress){


		System.out.println("Actor chosen: " + actor);
        System.out.println("Actress chosen: " + actress);
        System.out.println("They are performing in the movie: " + movName);
		Release.publish(movName);
}
}