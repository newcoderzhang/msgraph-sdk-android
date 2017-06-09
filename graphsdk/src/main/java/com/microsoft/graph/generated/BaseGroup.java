// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Group.
 */
public class BaseGroup extends DirectoryObject implements IJsonBackedObject {


    public BaseGroup() {
        oDataType = "microsoft.graph.group";
    }

    /**
     * The Description.
	 * 
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Display Name.
	 * 
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Group Types.
	 * 
     */
    @SerializedName("groupTypes")
    @Expose
    public java.util.List<String> groupTypes;

    /**
     * The Mail.
	 * 
     */
    @SerializedName("mail")
    @Expose
    public String mail;

    /**
     * The Mail Enabled.
	 * 
     */
    @SerializedName("mailEnabled")
    @Expose
    public Boolean mailEnabled;

    /**
     * The Mail Nickname.
	 * 
     */
    @SerializedName("mailNickname")
    @Expose
    public String mailNickname;

    /**
     * The On Premises Last Sync Date Time.
	 * 
     */
    @SerializedName("onPremisesLastSyncDateTime")
    @Expose
    public java.util.Calendar onPremisesLastSyncDateTime;

    /**
     * The On Premises Security Identifier.
	 * 
     */
    @SerializedName("onPremisesSecurityIdentifier")
    @Expose
    public String onPremisesSecurityIdentifier;

    /**
     * The On Premises Sync Enabled.
	 * 
     */
    @SerializedName("onPremisesSyncEnabled")
    @Expose
    public Boolean onPremisesSyncEnabled;

    /**
     * The Proxy Addresses.
	 * 
     */
    @SerializedName("proxyAddresses")
    @Expose
    public java.util.List<String> proxyAddresses;

    /**
     * The Security Enabled.
	 * 
     */
    @SerializedName("securityEnabled")
    @Expose
    public Boolean securityEnabled;

    /**
     * The Visibility.
	 * 
     */
    @SerializedName("visibility")
    @Expose
    public String visibility;

    /**
     * The Allow External Senders.
	 * 
     */
    @SerializedName("allowExternalSenders")
    @Expose
    public Boolean allowExternalSenders;

    /**
     * The Auto Subscribe New Members.
	 * 
     */
    @SerializedName("autoSubscribeNewMembers")
    @Expose
    public Boolean autoSubscribeNewMembers;

    /**
     * The Is Subscribed By Mail.
	 * 
     */
    @SerializedName("isSubscribedByMail")
    @Expose
    public Boolean isSubscribedByMail;

    /**
     * The Unseen Count.
	 * 
     */
    @SerializedName("unseenCount")
    @Expose
    public Integer unseenCount;

    /**
     * The Members.
	 * 
     */
    public transient DirectoryObjectCollectionPage members;

    /**
     * The Member Of.
	 * 
     */
    public transient DirectoryObjectCollectionPage memberOf;

    /**
     * The Created On Behalf Of.
	 * 
     */
    @SerializedName("createdOnBehalfOf")
    @Expose
    public DirectoryObject createdOnBehalfOf;

    /**
     * The Owners.
	 * 
     */
    public transient DirectoryObjectCollectionPage owners;

    /**
     * The Extensions.
	 * 
     */
    public transient ExtensionCollectionPage extensions;

    /**
     * The Threads.
	 * 
     */
    public transient ConversationThreadCollectionPage threads;

    /**
     * The Calendar.
	 * 
     */
    @SerializedName("calendar")
    @Expose
    public Calendar calendar;

    /**
     * The Calendar View.
	 * 
     */
    public transient EventCollectionPage calendarView;

    /**
     * The Events.
	 * 
     */
    public transient EventCollectionPage events;

    /**
     * The Conversations.
	 * 
     */
    public transient ConversationCollectionPage conversations;

    /**
     * The Photo.
	 * 
     */
    @SerializedName("photo")
    @Expose
    public ProfilePhoto photo;

    /**
     * The Photos.
	 * 
     */
    public transient ProfilePhotoCollectionPage photos;

    /**
     * The Accepted Senders.
	 * 
     */
    public transient DirectoryObjectCollectionPage acceptedSenders;

    /**
     * The Rejected Senders.
	 * 
     */
    public transient DirectoryObjectCollectionPage rejectedSenders;

    /**
     * The Drive.
	 * 
     */
    @SerializedName("drive")
    @Expose
    public Drive drive;

    /**
     * The Drives.
	 * 
     */
    public transient DriveCollectionPage drives;

    /**
     * The Sites.
	 * 
     */
    public transient SiteCollectionPage sites;

    /**
     * The Planner.
	 * 
     */
    @SerializedName("planner")
    @Expose
    public PlannerGroup planner;

    /**
     * The Onenote.
	 * 
     */
    @SerializedName("onenote")
    @Expose
    public Onenote onenote;


    /**
     * The raw representation of this class
     */
    private transient JsonObject mRawObject;

    /**
     * The serializer
     */
    private transient ISerializer mSerializer;

    /**
     * Gets the raw representation of this class
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return mRawObject;
    }

    /**
     * Gets serializer
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return mSerializer;
    }

    /**
     * Sets the raw json object
     *
     * @param serializer The serializer
     * @param json The json object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        mSerializer = serializer;
        mRawObject = json;


        if (json.has("members")) {
            final BaseDirectoryObjectCollectionResponse response = new BaseDirectoryObjectCollectionResponse();
            if (json.has("members@odata.nextLink")) {
                response.nextLink = json.get("members@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("members").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            members = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("memberOf")) {
            final BaseDirectoryObjectCollectionResponse response = new BaseDirectoryObjectCollectionResponse();
            if (json.has("memberOf@odata.nextLink")) {
                response.nextLink = json.get("memberOf@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("memberOf").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            memberOf = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("owners")) {
            final BaseDirectoryObjectCollectionResponse response = new BaseDirectoryObjectCollectionResponse();
            if (json.has("owners@odata.nextLink")) {
                response.nextLink = json.get("owners@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("owners").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            owners = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("extensions")) {
            final BaseExtensionCollectionResponse response = new BaseExtensionCollectionResponse();
            if (json.has("extensions@odata.nextLink")) {
                response.nextLink = json.get("extensions@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("extensions").toString(), JsonObject[].class);
            final Extension[] array = new Extension[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Extension.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            extensions = new ExtensionCollectionPage(response, null);
        }

        if (json.has("threads")) {
            final BaseConversationThreadCollectionResponse response = new BaseConversationThreadCollectionResponse();
            if (json.has("threads@odata.nextLink")) {
                response.nextLink = json.get("threads@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("threads").toString(), JsonObject[].class);
            final ConversationThread[] array = new ConversationThread[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ConversationThread.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            threads = new ConversationThreadCollectionPage(response, null);
        }

        if (json.has("calendarView")) {
            final BaseEventCollectionResponse response = new BaseEventCollectionResponse();
            if (json.has("calendarView@odata.nextLink")) {
                response.nextLink = json.get("calendarView@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("calendarView").toString(), JsonObject[].class);
            final Event[] array = new Event[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Event.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            calendarView = new EventCollectionPage(response, null);
        }

        if (json.has("events")) {
            final BaseEventCollectionResponse response = new BaseEventCollectionResponse();
            if (json.has("events@odata.nextLink")) {
                response.nextLink = json.get("events@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("events").toString(), JsonObject[].class);
            final Event[] array = new Event[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Event.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            events = new EventCollectionPage(response, null);
        }

        if (json.has("conversations")) {
            final BaseConversationCollectionResponse response = new BaseConversationCollectionResponse();
            if (json.has("conversations@odata.nextLink")) {
                response.nextLink = json.get("conversations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("conversations").toString(), JsonObject[].class);
            final Conversation[] array = new Conversation[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Conversation.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            conversations = new ConversationCollectionPage(response, null);
        }

        if (json.has("photos")) {
            final BaseProfilePhotoCollectionResponse response = new BaseProfilePhotoCollectionResponse();
            if (json.has("photos@odata.nextLink")) {
                response.nextLink = json.get("photos@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("photos").toString(), JsonObject[].class);
            final ProfilePhoto[] array = new ProfilePhoto[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), ProfilePhoto.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            photos = new ProfilePhotoCollectionPage(response, null);
        }

        if (json.has("acceptedSenders")) {
            final BaseDirectoryObjectCollectionResponse response = new BaseDirectoryObjectCollectionResponse();
            if (json.has("acceptedSenders@odata.nextLink")) {
                response.nextLink = json.get("acceptedSenders@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("acceptedSenders").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            acceptedSenders = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("rejectedSenders")) {
            final BaseDirectoryObjectCollectionResponse response = new BaseDirectoryObjectCollectionResponse();
            if (json.has("rejectedSenders@odata.nextLink")) {
                response.nextLink = json.get("rejectedSenders@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("rejectedSenders").toString(), JsonObject[].class);
            final DirectoryObject[] array = new DirectoryObject[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DirectoryObject.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            rejectedSenders = new DirectoryObjectCollectionPage(response, null);
        }

        if (json.has("drives")) {
            final BaseDriveCollectionResponse response = new BaseDriveCollectionResponse();
            if (json.has("drives@odata.nextLink")) {
                response.nextLink = json.get("drives@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("drives").toString(), JsonObject[].class);
            final Drive[] array = new Drive[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Drive.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            drives = new DriveCollectionPage(response, null);
        }

        if (json.has("sites")) {
            final BaseSiteCollectionResponse response = new BaseSiteCollectionResponse();
            if (json.has("sites@odata.nextLink")) {
                response.nextLink = json.get("sites@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("sites").toString(), JsonObject[].class);
            final Site[] array = new Site[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Site.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            sites = new SiteCollectionPage(response, null);
        }
    }
}
