package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * This is a sample class to launch a rule.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {
            // load up the knowledge base
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            // go !
        	Divisao d1 = new Divisao ("cozinha");
           	Divisao d2 = new Divisao ("escritório");
           	Divisao d3 = new Divisao ("sala");
           	Divisao d4 = new Divisao ("quarto");
           	Divisao d5 = new Divisao ("garagem");
           	kSession.insert( d1 );
           	kSession.insert( d2 );
           	kSession.insert( d3 );
           	kSession.insert( d4 );
           	kSession.insert( d5 );
           	AlarmeTotal at1 = new AlarmeTotal (d1 , false); // Cozinha tem alarme total
           	AlarmeTotal at2 = new AlarmeTotal (d2 , false); // escritorio tem alarme total
           	AlarmeTotal at3 = new AlarmeTotal (d3 , false); // sala tem alarme total
           	AlarmeTotal at4 = new AlarmeTotal (d4 , false); // quarto tem alarme total
           	AlarmeTotal at5 = new AlarmeTotal (d5 , false); // garagem tem alarme total
           	kSession.insert( at1 );
           	kSession.insert( at2 );
           	kSession.insert( at3 );
           	kSession.insert( at4 );
           	kSession.insert( at5 );
           	AlarmeParcial ap1 = new AlarmeParcial(d4 , false); // Quarto nao tem alarme parcial
           	AlarmeParcial ap2 = new AlarmeParcial(d5 , false);	// Garagem nao tem alarme parcial
           	kSession.insert( ap1 );
           	kSession.insert( ap2 );
           	DetecaoIntruso detecao = new DetecaoIntruso(true, true); // Exemplo de detecção de intruso
           	kSession.insert(detecao);
           	
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static class Message {

        public static final int HELLO = 0;
        public static final int GOODBYE = 1;

        private String message;

        private int status;

        public String getMessage() {
            return this.message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public int getStatus() {
            return this.status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

    }

}
