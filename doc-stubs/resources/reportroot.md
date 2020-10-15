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

**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List reportRoots](../api/reportroot-list.md)|[reportRoot](../resources/reportroot.md) collection|Get a list of the [reportRoot](../resources/reportroot.md) objects and their properties.|
|[Create reportRoot](../api/reportroot-create.md)|[reportRoot](../resources/reportroot.md)|Create a new [reportRoot](../resources/reportroot.md) object.|
|[Get reportRoot](../api/reportroot-get.md)|[reportRoot](../resources/reportroot.md)|Read the properties and relationships of a [reportRoot](../resources/reportroot.md) object.|
|[Update reportRoot](../api/reportroot-update.md)|[reportRoot](../resources/reportroot.md)|Update the properties of a [reportRoot](../resources/reportroot.md) object.|
|[Delete reportRoot](../api/reportroot-delete.md)|None|Deletes a [reportRoot](../resources/reportroot.md) object.|
|[getTeamsUserActivityTotalCounts](../api/reportroot-getteamsuseractivitytotalcounts.md)|[teamsUserActivityCounts](../resources/teamsuseractivitycounts.md) collection|**TODO: Add Description**|
|[getTeamsUserActivityTotalUserCounts](../api/reportroot-getteamsuseractivitytotalusercounts.md)|[teamsUserActivityUserCounts](../resources/teamsuseractivityusercounts.md) collection|**TODO: Add Description**|
|[getTeamsDeviceUsageTotalUserCounts](../api/reportroot-getteamsdeviceusagetotalusercounts.md)|[teamsDeviceUsageUserCounts](../resources/teamsdeviceusageusercounts.md) collection|**TODO: Add Description**|
|[getTeamsDeviceUsageDistributionTotalUserCounts](../api/reportroot-getteamsdeviceusagedistributiontotalusercounts.md)|[teamsDeviceUsageDistributionUserCounts](../resources/teamsdeviceusagedistributionusercounts.md) collection|**TODO: Add Description**|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|applicationSignInDetailedSummary|[applicationSignInDetailedSummary](../resources/applicationsignindetailedsummary.md) collection|**TODO: Add Description**|
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

