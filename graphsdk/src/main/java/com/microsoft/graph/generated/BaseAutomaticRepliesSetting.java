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
import java.util.List;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.*;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Automatic Replies Setting.
 */
public class BaseAutomaticRepliesSetting implements IJsonBackedObject {

    @SerializedName("@odata.type")
    @Expose(serialize = false)
    public String oDataType;

    private transient AdditionalDataManager additionalDataManager = new AdditionalDataManager(this);

    @Override
    public final AdditionalDataManager getAdditionalDataManager() {
        return additionalDataManager;
    }

    public BaseAutomaticRepliesSetting() {
        oDataType = "microsoft.graph.automaticRepliesSetting";
    }

    /**
     * The Status.
     */
    @SerializedName("status")
    @Expose
    public AutomaticRepliesStatus status;

    /**
     * The External Audience.
     */
    @SerializedName("externalAudience")
    @Expose
    public ExternalAudienceScope externalAudience;

    /**
     * The Scheduled Start Date Time.
     */
    @SerializedName("scheduledStartDateTime")
    @Expose
    public DateTimeTimeZone scheduledStartDateTime;

    /**
     * The Scheduled End Date Time.
     */
    @SerializedName("scheduledEndDateTime")
    @Expose
    public DateTimeTimeZone scheduledEndDateTime;

    /**
     * The Internal Reply Message.
     */
    @SerializedName("internalReplyMessage")
    @Expose
    public String internalReplyMessage;

    /**
     * The External Reply Message.
     */
    @SerializedName("externalReplyMessage")
    @Expose
    public String externalReplyMessage;


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

    }
}