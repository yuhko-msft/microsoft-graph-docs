---
title: "Update privacyAccessControls"
description: "Update the properties of a privacyAccessControls object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update privacyAccessControls
Namespace: microsoft.graph

Update the properties of a privacyAccessControls object.

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
PATCH ** Collection URI for microsoft.graph.windowsPrivacyDataAccessControlItem not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsPrivacyDataAccessControlItem](../resources/intune-windowsprivacydataaccesscontrolitem.md) object.

The following table shows the properties that are required when you create the [windowsPrivacyDataAccessControlItem](../resources/intune-windowsprivacydataaccesscontrolitem.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|accessLevel|windowsPrivacyDataAccessLevel|**TODO: Add Description**. Possible values are: `notConfigured`, `forceAllow`, `forceDeny`, `userInControl`.|
|dataCategory|windowsPrivacyDataCategory|**TODO: Add Description**. Possible values are: `notConfigured`, `accountInfo`, `appsRunInBackground`, `calendar`, `callHistory`, `camera`, `contacts`, `diagnosticsInfo`, `email`, `location`, `messaging`, `microphone`, `motion`, `notifications`, `phone`, `radios`, `tasks`, `syncWithDevices`, `trustedDevices`.|
|appPackageFamilyName|String|**TODO: Add Description**|
|appDisplayName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [windowsPrivacyDataAccessControlItem](../resources/intune-windowsprivacydataaccesscontrolitem.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_privacyaccesscontrols"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Collection URI for microsoft.graph.windowsPrivacyDataAccessControlItem not found
Content-Type: application/json
Content-length: 202

{
  "@odata.type": "#microsoft.graph.windowsPrivacyDataAccessControlItem",
  "accessLevel": "String",
  "dataCategory": "String",
  "appPackageFamilyName": "String",
  "appDisplayName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.windowsPrivacyDataAccessControlItem",
  "id": "96e4e7e8-e7e8-96e4-e8e7-e496e8e7e496",
  "accessLevel": "String",
  "dataCategory": "String",
  "appPackageFamilyName": "String",
  "appDisplayName": "String"
}
```

