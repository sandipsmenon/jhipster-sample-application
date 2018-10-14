package com.sandip.jhipster.cucumber.stepdefs;

import com.sandip.jhipster.JhipsterreactApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipsterreactApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
