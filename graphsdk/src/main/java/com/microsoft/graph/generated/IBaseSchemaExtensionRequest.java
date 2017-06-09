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

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Schema Extension Request.
 */
public interface IBaseSchemaExtensionRequest extends IHttpRequest {

    /**
     * Gets the SchemaExtension from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<SchemaExtension> callback);

    /**
     * Gets the SchemaExtension from the service
     * @return The SchemaExtension from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    SchemaExtension get() throws ClientException;

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SchemaExtension with a source
     * @param sourceSchemaExtension The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final SchemaExtension sourceSchemaExtension, final ICallback<SchemaExtension> callback);

    /**
     * Patches this SchemaExtension with a source
     * @param sourceSchemaExtension The source object with updates
     * @return The updated SchemaExtension
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    SchemaExtension patch(final SchemaExtension sourceSchemaExtension) throws ClientException;

    /**
     * Posts a SchemaExtension with a new object
     * @param newSchemaExtension The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final SchemaExtension newSchemaExtension, final ICallback<SchemaExtension> callback);

    /**
     * Posts a SchemaExtension with a new object
     * @param newSchemaExtension The new object to create
     * @return The created SchemaExtension
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    SchemaExtension post(final SchemaExtension newSchemaExtension) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseSchemaExtensionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseSchemaExtensionRequest expand(final String value);

}
