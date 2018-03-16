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
 * The interface for the Base Report Root Request Builder.
 */
public interface IBaseReportRootRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     */
    IReportRootRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     */
    IReportRootRequest buildRequest(final java.util.List<Option> requestOptions);
    IReportRootGetOffice365ActivationsUserDetailRequestBuilder getGetOffice365ActivationsUserDetail();
    IReportRootGetOffice365ActivationCountsRequestBuilder getGetOffice365ActivationCounts();
    IReportRootGetOffice365ActivationsUserCountsRequestBuilder getGetOffice365ActivationsUserCounts();
    IReportRootGetOffice365ActiveUserDetailRequestBuilder getGetOffice365ActiveUserDetail(final com.microsoft.graph.model.DateOnly date);
    IReportRootGetOffice365ActiveUserDetailRequestBuilder getGetOffice365ActiveUserDetail(final String period);
    IReportRootGetOffice365ServicesUserCountsRequestBuilder getGetOffice365ServicesUserCounts(final String period);
    IReportRootGetOffice365ActiveUserCountsRequestBuilder getGetOffice365ActiveUserCounts(final String period);
    IReportRootGetOffice365GroupsActivityDetailRequestBuilder getGetOffice365GroupsActivityDetail(final com.microsoft.graph.model.DateOnly date);
    IReportRootGetOffice365GroupsActivityDetailRequestBuilder getGetOffice365GroupsActivityDetail(final String period);
    IReportRootGetOffice365GroupsActivityCountsRequestBuilder getGetOffice365GroupsActivityCounts(final String period);
    IReportRootGetOffice365GroupsActivityGroupCountsRequestBuilder getGetOffice365GroupsActivityGroupCounts(final String period);
    IReportRootGetOffice365GroupsActivityStorageRequestBuilder getGetOffice365GroupsActivityStorage(final String period);
    IReportRootGetOffice365GroupsActivityFileCountsRequestBuilder getGetOffice365GroupsActivityFileCounts(final String period);
    IReportRootGetEmailActivityUserDetailRequestBuilder getGetEmailActivityUserDetail(final com.microsoft.graph.model.DateOnly date);
    IReportRootGetEmailActivityUserDetailRequestBuilder getGetEmailActivityUserDetail(final String period);
    IReportRootGetEmailActivityCountsRequestBuilder getGetEmailActivityCounts(final String period);
    IReportRootGetEmailActivityUserCountsRequestBuilder getGetEmailActivityUserCounts(final String period);
    IReportRootGetEmailAppUsageUserDetailRequestBuilder getGetEmailAppUsageUserDetail(final com.microsoft.graph.model.DateOnly date);
    IReportRootGetEmailAppUsageUserDetailRequestBuilder getGetEmailAppUsageUserDetail(final String period);
    IReportRootGetEmailAppUsageAppsUserCountsRequestBuilder getGetEmailAppUsageAppsUserCounts(final String period);
    IReportRootGetEmailAppUsageUserCountsRequestBuilder getGetEmailAppUsageUserCounts(final String period);
    IReportRootGetEmailAppUsageVersionsUserCountsRequestBuilder getGetEmailAppUsageVersionsUserCounts(final String period);
    IReportRootGetMailboxUsageDetailRequestBuilder getGetMailboxUsageDetail(final String period);
    IReportRootGetMailboxUsageMailboxCountsRequestBuilder getGetMailboxUsageMailboxCounts(final String period);
    IReportRootGetMailboxUsageQuotaStatusMailboxCountsRequestBuilder getGetMailboxUsageQuotaStatusMailboxCounts(final String period);
    IReportRootGetMailboxUsageStorageRequestBuilder getGetMailboxUsageStorage(final String period);
    IReportRootGetOneDriveActivityUserDetailRequestBuilder getGetOneDriveActivityUserDetail(final com.microsoft.graph.model.DateOnly date);
    IReportRootGetOneDriveActivityUserDetailRequestBuilder getGetOneDriveActivityUserDetail(final String period);
    IReportRootGetOneDriveActivityUserCountsRequestBuilder getGetOneDriveActivityUserCounts(final String period);
    IReportRootGetOneDriveActivityFileCountsRequestBuilder getGetOneDriveActivityFileCounts(final String period);
    IReportRootGetOneDriveUsageAccountDetailRequestBuilder getGetOneDriveUsageAccountDetail(final com.microsoft.graph.model.DateOnly date);
    IReportRootGetOneDriveUsageAccountDetailRequestBuilder getGetOneDriveUsageAccountDetail(final String period);
    IReportRootGetOneDriveUsageAccountCountsRequestBuilder getGetOneDriveUsageAccountCounts(final String period);
    IReportRootGetOneDriveUsageFileCountsRequestBuilder getGetOneDriveUsageFileCounts(final String period);
    IReportRootGetOneDriveUsageStorageRequestBuilder getGetOneDriveUsageStorage(final String period);
    IReportRootGetSharePointActivityUserDetailRequestBuilder getGetSharePointActivityUserDetail(final com.microsoft.graph.model.DateOnly date);
    IReportRootGetSharePointActivityUserDetailRequestBuilder getGetSharePointActivityUserDetail(final String period);
    IReportRootGetSharePointActivityFileCountsRequestBuilder getGetSharePointActivityFileCounts(final String period);
    IReportRootGetSharePointActivityUserCountsRequestBuilder getGetSharePointActivityUserCounts(final String period);
    IReportRootGetSharePointActivityPagesRequestBuilder getGetSharePointActivityPages(final String period);
    IReportRootGetSharePointSiteUsageDetailRequestBuilder getGetSharePointSiteUsageDetail(final com.microsoft.graph.model.DateOnly date);
    IReportRootGetSharePointSiteUsageDetailRequestBuilder getGetSharePointSiteUsageDetail(final String period);
    IReportRootGetSharePointSiteUsageFileCountsRequestBuilder getGetSharePointSiteUsageFileCounts(final String period);
    IReportRootGetSharePointSiteUsageSiteCountsRequestBuilder getGetSharePointSiteUsageSiteCounts(final String period);
    IReportRootGetSharePointSiteUsageStorageRequestBuilder getGetSharePointSiteUsageStorage(final String period);
    IReportRootGetSharePointSiteUsagePagesRequestBuilder getGetSharePointSiteUsagePages(final String period);
    IReportRootGetSkypeForBusinessActivityUserDetailRequestBuilder getGetSkypeForBusinessActivityUserDetail(final com.microsoft.graph.model.DateOnly date);
    IReportRootGetSkypeForBusinessActivityUserDetailRequestBuilder getGetSkypeForBusinessActivityUserDetail(final String period);
    IReportRootGetSkypeForBusinessActivityCountsRequestBuilder getGetSkypeForBusinessActivityCounts(final String period);
    IReportRootGetSkypeForBusinessActivityUserCountsRequestBuilder getGetSkypeForBusinessActivityUserCounts(final String period);
    IReportRootGetSkypeForBusinessPeerToPeerActivityCountsRequestBuilder getGetSkypeForBusinessPeerToPeerActivityCounts(final String period);
    IReportRootGetSkypeForBusinessPeerToPeerActivityUserCountsRequestBuilder getGetSkypeForBusinessPeerToPeerActivityUserCounts(final String period);
    IReportRootGetSkypeForBusinessPeerToPeerActivityMinuteCountsRequestBuilder getGetSkypeForBusinessPeerToPeerActivityMinuteCounts(final String period);
    IReportRootGetSkypeForBusinessOrganizerActivityCountsRequestBuilder getGetSkypeForBusinessOrganizerActivityCounts(final String period);
    IReportRootGetSkypeForBusinessOrganizerActivityUserCountsRequestBuilder getGetSkypeForBusinessOrganizerActivityUserCounts(final String period);
    IReportRootGetSkypeForBusinessOrganizerActivityMinuteCountsRequestBuilder getGetSkypeForBusinessOrganizerActivityMinuteCounts(final String period);
    IReportRootGetSkypeForBusinessParticipantActivityCountsRequestBuilder getGetSkypeForBusinessParticipantActivityCounts(final String period);
    IReportRootGetSkypeForBusinessParticipantActivityUserCountsRequestBuilder getGetSkypeForBusinessParticipantActivityUserCounts(final String period);
    IReportRootGetSkypeForBusinessParticipantActivityMinuteCountsRequestBuilder getGetSkypeForBusinessParticipantActivityMinuteCounts(final String period);
    IReportRootGetSkypeForBusinessDeviceUsageUserDetailRequestBuilder getGetSkypeForBusinessDeviceUsageUserDetail(final com.microsoft.graph.model.DateOnly date);
    IReportRootGetSkypeForBusinessDeviceUsageUserDetailRequestBuilder getGetSkypeForBusinessDeviceUsageUserDetail(final String period);
    IReportRootGetSkypeForBusinessDeviceUsageDistributionUserCountsRequestBuilder getGetSkypeForBusinessDeviceUsageDistributionUserCounts(final String period);
    IReportRootGetSkypeForBusinessDeviceUsageUserCountsRequestBuilder getGetSkypeForBusinessDeviceUsageUserCounts(final String period);
    IReportRootGetYammerActivityUserDetailRequestBuilder getGetYammerActivityUserDetail(final com.microsoft.graph.model.DateOnly date);
    IReportRootGetYammerActivityUserDetailRequestBuilder getGetYammerActivityUserDetail(final String period);
    IReportRootGetYammerActivityCountsRequestBuilder getGetYammerActivityCounts(final String period);
    IReportRootGetYammerActivityUserCountsRequestBuilder getGetYammerActivityUserCounts(final String period);
    IReportRootGetYammerDeviceUsageUserDetailRequestBuilder getGetYammerDeviceUsageUserDetail(final com.microsoft.graph.model.DateOnly date);
    IReportRootGetYammerDeviceUsageUserDetailRequestBuilder getGetYammerDeviceUsageUserDetail(final String period);
    IReportRootGetYammerDeviceUsageDistributionUserCountsRequestBuilder getGetYammerDeviceUsageDistributionUserCounts(final String period);
    IReportRootGetYammerDeviceUsageUserCountsRequestBuilder getGetYammerDeviceUsageUserCounts(final String period);
    IReportRootGetYammerGroupsActivityDetailRequestBuilder getGetYammerGroupsActivityDetail(final com.microsoft.graph.model.DateOnly date);
    IReportRootGetYammerGroupsActivityDetailRequestBuilder getGetYammerGroupsActivityDetail(final String period);
    IReportRootGetYammerGroupsActivityGroupCountsRequestBuilder getGetYammerGroupsActivityGroupCounts(final String period);
    IReportRootGetYammerGroupsActivityCountsRequestBuilder getGetYammerGroupsActivityCounts(final String period);
    IReportRootGetTeamsUserActivityUserDetailRequestBuilder getGetTeamsUserActivityUserDetail(final com.microsoft.graph.model.DateOnly date);
    IReportRootGetTeamsUserActivityUserDetailRequestBuilder getGetTeamsUserActivityUserDetail(final String period);
    IReportRootGetTeamsUserActivityCountsRequestBuilder getGetTeamsUserActivityCounts(final String period);
    IReportRootGetTeamsUserActivityUserCountsRequestBuilder getGetTeamsUserActivityUserCounts(final String period);
    IReportRootGetTeamsDeviceUsageUserDetailRequestBuilder getGetTeamsDeviceUsageUserDetail(final com.microsoft.graph.model.DateOnly date);
    IReportRootGetTeamsDeviceUsageUserDetailRequestBuilder getGetTeamsDeviceUsageUserDetail(final String period);
    IReportRootGetTeamsDeviceUsageUserCountsRequestBuilder getGetTeamsDeviceUsageUserCounts(final String period);
    IReportRootGetTeamsDeviceUsageDistributionUserCountsRequestBuilder getGetTeamsDeviceUsageDistributionUserCounts(final String period);

}