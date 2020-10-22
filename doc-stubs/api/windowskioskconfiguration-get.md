---
title: "Get windowsKioskConfiguration"
description: "Read the properties and relationships of a windowsKioskConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get windowsKioskConfiguration
Namespace: microsoft.graph

Read the properties and relationships of a [windowsKioskConfiguration](../resources/windowskioskconfiguration.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
GET ** Entity URI for microsoft.graph.windowsKioskConfiguration not found
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [windowsKioskConfiguration](../resources/windowskioskconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_windowskioskconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/beta** Entity URI for microsoft.graph.windowsKioskConfiguration not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsKioskConfiguration"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": {
    "@odata.type": "#microsoft.graph.windowsKioskConfiguration",
    "id": "58480be9-0be9-5848-e90b-4858e90b4858",
    "lastModifiedDateTime": "String (timestamp)",
    "roleScopeTagIds": [
      "String"
    ],
    "supportsScopeTags": "Boolean",
    "deviceManagementApplicabilityRuleOsEdition": {
      "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
    },
    "deviceManagementApplicabilityRuleOsVersion": {
      "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
    },
    "deviceManagementApplicabilityRuleDeviceMode": {
      "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
    },
    "createdDateTime": "String (timestamp)",
    "description": "String",
    "displayName": "String",
    "version": "Integer",
    "kioskProfiles": [
      {
        "@odata.type": "microsoft.graph.windowsKioskProfile"
      }
    ],
    "kioskBrowserDefaultUrl": "String",
    "kioskBrowserEnableHomeButton": "Boolean",
    "kioskBrowserEnableNavigationButtons": "Boolean",
    "kioskBrowserEnableEndSessionButton": "Boolean",
    "kioskBrowserRestartOnIdleTimeInMinutes": "Integer",
    "kioskBrowserBlockedURLs": [
      "String"
    ],
    "kioskBrowserBlockedUrlExceptions": [
      "String"
    ],
    "edgeKioskEnablePublicBrowsing": "Boolean",
    "windowsKioskForceUpdateSchedule": {
      "@odata.type": "microsoft.graph.windowsKioskForceUpdateSchedule"
    }
  }
}
```

