---
title: "Update deviceManagement"
description: "Update the properties of a deviceManagement object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceManagement
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [deviceManagement](../resources/intune-devicemanagement.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
PATCH /deviceManagement
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


|Property|Type|Description|
|:---|:---|:---|
|settings|[deviceManagementSettings](../resources/intune-devicemanagementsettings.md)|**TODO: Add Description** Optional.|
|maximumDepTokens|Int32|**TODO: Add Description** Required.|
|intuneAccountId|Guid|**TODO: Add Description** Required.|
|lastReportAggregationDateTime|DateTimeOffset|**TODO: Add Description** Required.|
|deviceComplianceReportSummarizationDateTime|DateTimeOffset|**TODO: Add Description** Required.|
|legacyPcManangementEnabled|Boolean|**TODO: Add Description** Required.|
|unlicensedAdminstratorsEnabled|Boolean|**TODO: Add Description** Required.|
|intuneBrand|[intuneBrand](../resources/intune-intunebrand.md)|**TODO: Add Description** Optional.|
|subscriptionState|deviceManagementSubscriptionState|**TODO: Add Description**. The possible values are: `pending`, `active`, `warning`, `disabled`, `deleted`, `blocked`, `lockedOut`. Required.|
|subscriptions|deviceManagementSubscriptions|**TODO: Add Description**. The possible values are: `none`, `intune`, `office365`, `intunePremium`, `intune_EDU`, `intune_SMB`. Required.|
|managedDeviceCleanupSettings|[managedDeviceCleanupSettings](../resources/intune-manageddevicecleanupsettings.md)|**TODO: Add Description** Optional.|
|adminConsent|[adminConsent](../resources/intune-adminconsent.md)|**TODO: Add Description** Optional.|
|deviceProtectionOverview|[deviceProtectionOverview](../resources/intune-deviceprotectionoverview.md)|**TODO: Add Description** Optional.|
|windowsMalwareOverview|[windowsMalwareOverview](../resources/intune-windowsmalwareoverview.md)|**TODO: Add Description** Optional.|
|accountMoveCompletionDateTime|DateTimeOffset|**TODO: Add Description** Required.|
|userExperienceAnalyticsSettings|[userExperienceAnalyticsSettings](../resources/intune-userexperienceanalyticssettings.md)|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceManagement](../resources/intune-devicemanagement.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_devicemanagement"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceManagement
Content-Type: application/json
Content-length: 1132

{
  "@odata.type": "#microsoft.graph.deviceManagement",
  "settings": {
    "@odata.type": "microsoft.graph.deviceManagementSettings"
  },
  "maximumDepTokens": "Integer",
  "intuneAccountId": "Guid",
  "lastReportAggregationDateTime": "String (timestamp)",
  "deviceComplianceReportSummarizationDateTime": "String (timestamp)",
  "legacyPcManangementEnabled": "Boolean",
  "unlicensedAdminstratorsEnabled": "Boolean",
  "intuneBrand": {
    "@odata.type": "microsoft.graph.intuneBrand"
  },
  "subscriptionState": "String",
  "subscriptions": "String",
  "managedDeviceCleanupSettings": {
    "@odata.type": "microsoft.graph.managedDeviceCleanupSettings"
  },
  "adminConsent": {
    "@odata.type": "microsoft.graph.adminConsent"
  },
  "deviceProtectionOverview": {
    "@odata.type": "microsoft.graph.deviceProtectionOverview"
  },
  "windowsMalwareOverview": {
    "@odata.type": "microsoft.graph.windowsMalwareOverview"
  },
  "accountMoveCompletionDateTime": "String (timestamp)",
  "userExperienceAnalyticsSettings": {
    "@odata.type": "microsoft.graph.userExperienceAnalyticsSettings"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.deviceManagement",
  "id": "08c2366e-366e-08c2-6e36-c2086e36c208",
  "settings": {
    "@odata.type": "microsoft.graph.deviceManagementSettings"
  },
  "maximumDepTokens": "Integer",
  "intuneAccountId": "Guid",
  "lastReportAggregationDateTime": "String (timestamp)",
  "deviceComplianceReportSummarizationDateTime": "String (timestamp)",
  "legacyPcManangementEnabled": "Boolean",
  "unlicensedAdminstratorsEnabled": "Boolean",
  "intuneBrand": {
    "@odata.type": "microsoft.graph.intuneBrand"
  },
  "subscriptionState": "String",
  "subscriptions": "String",
  "managedDeviceCleanupSettings": {
    "@odata.type": "microsoft.graph.managedDeviceCleanupSettings"
  },
  "adminConsent": {
    "@odata.type": "microsoft.graph.adminConsent"
  },
  "deviceProtectionOverview": {
    "@odata.type": "microsoft.graph.deviceProtectionOverview"
  },
  "windowsMalwareOverview": {
    "@odata.type": "microsoft.graph.windowsMalwareOverview"
  },
  "accountMoveCompletionDateTime": "String (timestamp)",
  "userExperienceAnalyticsSettings": {
    "@odata.type": "microsoft.graph.userExperienceAnalyticsSettings"
  }
}
```

