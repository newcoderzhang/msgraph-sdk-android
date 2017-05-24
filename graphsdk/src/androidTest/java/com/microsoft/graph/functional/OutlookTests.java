package com.microsoft.graph.functional;

import android.test.AndroidTestCase;
import android.test.suitebuilder.annotation.Suppress;

import com.microsoft.graph.extensions.EmailAddress;
import com.microsoft.graph.extensions.Message;
import com.microsoft.graph.extensions.Recipient;
import com.microsoft.graph.extensions.User;

import org.junit.Test;

import java.util.ArrayList;

@Suppress
public class OutlookTests extends AndroidTestCase {

    @Test
    public void testQueryDeletedItems() {
        TestBase testBase = new TestBase();
        //IDirectoryDeletedItemsCollectionPage deletedItems = testBase.graphClient.getDirectory().getDeletedItemsByType("microsoft.graph.group").buildRequest().get();
        //assertNotNull(deletedItems);
    }

    @Test
    public void testSendMail() {
        TestBase testBase = new TestBase();
        User me = testBase.graphClient.getMe().buildRequest().get();
        Recipient r = new Recipient();
        EmailAddress address = new EmailAddress();
        address.address = me.mail;
        r.emailAddress = address;
        Message message = new Message();
        message.subject = "Test E-Mail";
        message.from = r;
        ArrayList<Recipient> recipients = new ArrayList<Recipient>();
        recipients.add(r);
        message.toRecipients = recipients;
        testBase.graphClient.getMe().getSendMail(message, true).buildRequest().post();
    }
}