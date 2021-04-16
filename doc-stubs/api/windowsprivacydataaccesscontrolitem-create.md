---
title: "Create windowsPrivacyDataAccessControlItem"
description: "Create a new windowsPrivacyDataAccessControlItem object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windowsPrivacyDataAccessControlItem
Namespace: microsoft.graph



Create a new [windowsPrivacyDataAccessControlItem](../resources/windowsprivacydataaccesscontrolitem.md) object.

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
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windowsPrivacyDataAccessControlItem](../resources/windowsprivacydataaccesscontrolitem.md) object.

The following table shows the properties that are required when you create the [windowsPrivacyDataAccessControlItem](../resources/windowsprivacydataaccesscontrolitem.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|accessLevel|windowsPrivacyDataAccessLevel|This indicates an access level for the privacy data category to which the specified application will be given to. Possible values are: `notConfigured`, `forceAllow`, `forceDeny`, `userInControl`.|
|appDisplayName|String|The Package Family Name of a Windows app. When set, the access level applies to the specified application.|
|appPackageFamilyName|String|The Package Family Name of a Windows app. When set, the access level applies to the specified application.|
|dataCategory|windowsPrivacyDataCategory|This indicates a privacy data category to which the specific access control will apply. Possible values are: `notConfigured`, `accountInfo`, `appsRunInBackground`, `calendar`, `callHistory`, `camera`, `contacts`, `diagnosticsInfo`, `email`, `location`, `messaging`, `microphone`, `motion`, `notifications`, `phone`, `radios`, `tasks`, `syncWithDevices`, `trustedDevices`.|



## Response

If successful, this method returns a `201 Created` response code and a [windowsPrivacyDataAccessControlItem](../resources/windowsprivacydataaccesscontrolitem.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windowsprivacydataaccesscontrolitem_from_"
}
-->
``` http

```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windowsPrivacyDataAccessControlItem"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windowsPrivacyDataAccessControlItem",
  "id": "6bcb5d55-5d55-6bcb-555d-cb6b555dcb6b",
  "accessLevel": "String",
  "appDisplayName": "String",
  "appPackageFamilyName": "String",
  "dataCategory": "String"
}
```

