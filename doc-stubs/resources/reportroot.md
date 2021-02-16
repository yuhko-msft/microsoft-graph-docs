---
title: "reportRoot resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# reportRoot resource type

Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[Get reportRoot](../api/reportroot-get.md)|[reportRoot](../resources/reportroot.md)|Read the properties and relationships of a [reportRoot](../resources/reportroot.md) object.|
|[Update reportRoot](../api/reportroot-update.md)|[reportRoot](../resources/reportroot.md)|Update the properties of a [reportRoot](../resources/reportroot.md) object.|
|[getTeamsUserActivityTotalCounts](../api/reportroot-getteamsuseractivitytotalcounts.md)|[teamsUserActivityCounts](../resources/teamsuseractivitycounts.md) collection|**TODO: Add Description**|
|[getTeamsUserActivityTotalUserCounts](../api/reportroot-getteamsuseractivitytotalusercounts.md)|[teamsUserActivityUserCounts](../resources/teamsuseractivityusercounts.md) collection|**TODO: Add Description**|
|[getTeamsDeviceUsageTotalUserCounts](../api/reportroot-getteamsdeviceusagetotalusercounts.md)|[teamsDeviceUsageUserCounts](../resources/teamsdeviceusageusercounts.md) collection|**TODO: Add Description**|
|[getTeamsDeviceUsageDistributionTotalUserCounts](../api/reportroot-getteamsdeviceusagedistributiontotalusercounts.md)|[teamsDeviceUsageDistributionUserCounts](../resources/teamsdeviceusagedistributionusercounts.md) collection|**TODO: Add Description**|
|[getUserArchivedPrintJobs](../api/reportroot-getuserarchivedprintjobs.md)|[archivedPrintJob](../resources/archivedprintjob.md) collection|**TODO: Add Description**|
|[getGroupArchivedPrintJobs](../api/reportroot-getgrouparchivedprintjobs.md)|[archivedPrintJob](../resources/archivedprintjob.md) collection|**TODO: Add Description**|
|[getPrinterArchivedPrintJobs](../api/reportroot-getprinterarchivedprintjobs.md)|[archivedPrintJob](../resources/archivedprintjob.md) collection|**TODO: Add Description**|
|[List dailyPrintUsageSummariesByPrinter](../api/reportroot-list-dailyprintusagesummariesbyprinter.md)|[PrintUsageSummaryByPrinter](../resources/printusagesummarybyprinter.md) collection|Get the PrintUsageSummaryByPrinter resources from the dailyPrintUsageSummariesByPrinter navigation property.|
|[Create PrintUsageSummaryByPrinter](../api/reportroot-post-dailyprintusagesummariesbyprinter.md)|[PrintUsageSummaryByPrinter](../resources/printusagesummarybyprinter.md)|Create a new PrintUsageSummaryByPrinter object.|
|[List dailyPrintUsageSummariesByUser](../api/reportroot-list-dailyprintusagesummariesbyuser.md)|[PrintUsageSummaryByUser](../resources/printusagesummarybyuser.md) collection|Get the PrintUsageSummaryByUser resources from the dailyPrintUsageSummariesByUser navigation property.|
|[Create PrintUsageSummaryByUser](../api/reportroot-post-dailyprintusagesummariesbyuser.md)|[PrintUsageSummaryByUser](../resources/printusagesummarybyuser.md)|Create a new PrintUsageSummaryByUser object.|
|[List monthlyPrintUsageSummariesByPrinter](../api/reportroot-list-monthlyprintusagesummariesbyprinter.md)|[PrintUsageSummaryByPrinter](../resources/printusagesummarybyprinter.md) collection|Get the PrintUsageSummaryByPrinter resources from the monthlyPrintUsageSummariesByPrinter navigation property.|
|[Create PrintUsageSummaryByPrinter](../api/reportroot-post-monthlyprintusagesummariesbyprinter.md)|[PrintUsageSummaryByPrinter](../resources/printusagesummarybyprinter.md)|Create a new PrintUsageSummaryByPrinter object.|
|[List monthlyPrintUsageSummariesByUser](../api/reportroot-list-monthlyprintusagesummariesbyuser.md)|[PrintUsageSummaryByUser](../resources/printusagesummarybyuser.md) collection|Get the PrintUsageSummaryByUser resources from the monthlyPrintUsageSummariesByUser navigation property.|
|[Create PrintUsageSummaryByUser](../api/reportroot-post-monthlyprintusagesummariesbyuser.md)|[PrintUsageSummaryByUser](../resources/printusagesummarybyuser.md)|Create a new PrintUsageSummaryByUser object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|applicationSignInDetailedSummary|[applicationSignInDetailedSummary](../resources/applicationsignindetailedsummary.md) collection|**TODO: Add Description**|
|authenticationMethods|[authenticationMethodsRoot](../resources/authenticationmethodsroot.md)|**TODO: Add Description**|
|credentialUserRegistrationDetails|[credentialUserRegistrationDetails](../resources/credentialuserregistrationdetails.md) collection|**TODO: Add Description**|
|dailyPrintUsageSummariesByPrinter|[PrintUsageSummaryByPrinter](../resources/printusagesummarybyprinter.md) collection|**TODO: Add Description**|
|dailyPrintUsageSummariesByUser|[PrintUsageSummaryByUser](../resources/printusagesummarybyuser.md) collection|**TODO: Add Description**|
|monthlyPrintUsageSummariesByPrinter|[PrintUsageSummaryByPrinter](../resources/printusagesummarybyprinter.md) collection|**TODO: Add Description**|
|monthlyPrintUsageSummariesByUser|[PrintUsageSummaryByUser](../resources/printusagesummarybyuser.md) collection|**TODO: Add Description**|
|userCredentialUsageDetails|[userCredentialUsageDetails](../resources/usercredentialusagedetails.md) collection|**TODO: Add Description**|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.reportRoot",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.reportRoot",
  "id": "String (identifier)"
}
```

