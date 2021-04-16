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
GET https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.windowsKioskConfiguration not found
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
    "id": "20009b9e-9b9e-2000-9e9b-00209e9b0020",
    "createdDateTime": "String (timestamp)",
    "description": "String",
    "deviceManagementApplicabilityRuleDeviceMode": {
      "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
    },
    "deviceManagementApplicabilityRuleOsEdition": {
      "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
    },
    "deviceManagementApplicabilityRuleOsVersion": {
      "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
    },
    "displayName": "String",
    "lastModifiedDateTime": "String (timestamp)",
    "roleScopeTagIds": [
      "String"
    ],
    "supportsScopeTags": "Boolean",
    "version": "Integer",
    "edgeKioskEnablePublicBrowsing": "Boolean",
    "kioskBrowserBlockedUrlExceptions": [
      "String"
    ],
    "kioskBrowserBlockedURLs": [
      "String"
    ],
    "kioskBrowserDefaultUrl": "String",
    "kioskBrowserEnableEndSessionButton": "Boolean",
    "kioskBrowserEnableHomeButton": "Boolean",
    "kioskBrowserEnableNavigationButtons": "Boolean",
    "kioskBrowserRestartOnIdleTimeInMinutes": "Integer",
    "kioskProfiles": [
      {
        "@odata.type": "microsoft.graph.windowsKioskProfile"
      }
    ],
    "windowsKioskForceUpdateSchedule": {
      "@odata.type": "microsoft.graph.windowsKioskForceUpdateSchedule"
    }
  }
}
```

