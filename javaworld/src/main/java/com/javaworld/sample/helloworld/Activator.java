package com.javaworld.sample.helloworld;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;


public class Activator implements BundleActivator {

    public void start(BundleContext context) throws Exception {
        System.out.println("Starting bundle");
        // do something with the context, e.g.
        // register services
        Client client = ClientBuilder.newClient();
        System.out.println("Now osgi budle is started....do something with the context.... ");
    }

    public void stop(BundleContext context) throws Exception {
        System.out.println("Stopping bundle");
        // do something with the context, e.g.
        // unregister service
        System.out.println("Now osgi budle is stoped.... ");
    }

}