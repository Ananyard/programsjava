package com.xworkz.hospitalapp.apollo;

    import com.xworkz.hospitalapp.hospital.Hospital;

    public class Apollo extends Hospital {
        @Override
        public boolean treatEmergency(){
            System.out.println("the treating the emergency situation during accidents");
            return true;
            }


    }
