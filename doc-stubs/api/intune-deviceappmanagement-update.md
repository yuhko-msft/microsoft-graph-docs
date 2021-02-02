---
title: "Update deviceAppManagement"
description: "Update the properties of a deviceAppManagement object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update deviceAppManagement
Namespace: microsoft.graph

Update the properties of a [deviceAppManagement](../resources/intune-deviceappmanagement.md) object.

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
PATCH /deviceAppManagement
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceAppManagement](../resources/intune-deviceappmanagement.md) object.

The following table shows the properties that are required when you update the [deviceAppManagement](../resources/intune-deviceappmanagement.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|microsoftStoreForBusinessLastSuccessfulSyncDateTime|DateTimeOffset|**TODO: Add Description**|
|isEnabledForMicrosoftStoreForBusiness|Boolean|**TODO: Add Description**|
|microsoftStoreForBusinessLanguage|String|**TODO: Add Description**|
|microsoftStoreForBusinessLastCompletedApplicationSyncTime|DateTimeOffset|**TODO: Add Description**|
|microsoftStoreForBusinessPortalSelection|microsoftStoreForBusinessPortalSelectionOptions|**TODO: Add Description**. Possible values are: `none`, `companyPortal`, `privateStore`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [deviceAppManagement](../resources/intune-deviceappmanagement.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_deviceappmanagement"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceAppManagement
Content-Type: application/json
Content-length: 389

{
  "@odata.type": "#microsoft.graph.deviceAppManagement",
  "microsoftStoreForBusinessLastSuccessfulSyncDateTime": "String (timestamp)",
  "isEnabledForMicrosoftStoreForBusiness": "Boolean",
  "microsoftStoreForBusinessLanguage": "String",
  "microsoftStoreForBusinessLastCompletedApplicationSyncTime": "String (timestamp)",
  "microsoftStoreForBusinessPortalSelection": "String"
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
  "@odata.type": "#microsoft.graph.deviceAppManagement",
  "id": "b124bd3c-bd3c-b124-3cbd-24b13cbd24b1",
  "microsoftStoreForBusinessLastSuccessfulSyncDateTime": "String (timestamp)",
  "isEnabledForMicrosoftStoreForBusiness": "Boolean",
  "microsoftStoreForBusinessLanguage": "String",
  "microsoftStoreForBusinessLastCompletedApplicationSyncTime": "String (timestamp)",
  "microsoftStoreForBusinessPortalSelection": "String"
}
```

