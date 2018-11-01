package com.sports.platform.gateway.cucumber.stepdefs;

import com.sports.platform.gateway.SportsplatformgatewayApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SportsplatformgatewayApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
