package topHeader;

import base.CommonAPI;

public class ATMorBrachOption extends CommonAPI {

    public void atmBrachOpt() {

        // ATM or Branch Option
        clickElement("//*[@id=\"navUtility\"]/div/div/ul/li[1]/a");

        //right corner search button to turn on
        clickElement("//button[@id='personetics-citi-menu']");

        //right corner search button to turn off
        clickElement("//button[@id='personetics-citi-menu']");

        //SearchBox and write address
        typeOnElement("//*[@id=\"search\"]", "132 Dawson Lane Jericho,NY,USA");

        //search button
        clickElement("//citi-search-cta[@aria-label='Search near by']//button[@type='button']");

        //Filter tab
        clickElement("#null-label");

        // ??????? Scroll Button locator ("//div[@id='resultListContainer']")

        //Full Service tab for Selection
        clickElement("//label[@id='fullservice-label']");

        //Check Deposite ATMs tab for Selection
        clickElement("//label[@id='cdatms-label']");

        //Drive Up ATMs
        clickElement("//label[@id='duatms-label']");

        //Relationship Manager tab for Selection
        clickElement("//label[@id='rm-label']");

        //Home Lending Officer tab for Selection
        clickElement("//label[@id='hlo-label']");

        //International Banking Center
        clickElement("//label[@id='ibc-label']");

        //Financial Advisor tab for Selection
        clickElement("//label[@id='fa-label']");

        // ATM tab for Selection
        clickElement("//label[@id='atms-label']");

        //Branch tab for Selection
        clickElement("//label[@id='branches-label']");

        //Apply all tab for Selection
        clickElement("//button[contains(text(),'Apply Filters')]");
    }
}
