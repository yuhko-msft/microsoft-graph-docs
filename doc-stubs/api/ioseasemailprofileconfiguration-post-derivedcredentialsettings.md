---
title: "Add derivedCredentialSettings"
description: "Add derivedCredentialSettings by posting to the derivedCredentialSettings collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add derivedCredentialSettings
Namespace: microsoft.graph

Add derivedCredentialSettings by posting to the derivedCredentialSettings collection.

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
POST /deviceManagement/derivedCredentials/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementDerivedCredentialSettings](../resources/intune-devicemanagementderivedcredentialsettings.md) object.

The following table shows the properties that are required when you create the [deviceManagementDerivedCredentialSettings](../resources/intune-devicemanagementderivedcredentialsettings.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|helpUrl|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|issuer|deviceManagementDerivedCredentialIssuer|**TODO: Add Description**. Possible values are: `intercede`, `entrustDatacard`, `purebred`, `xTec`.|
|notificationType|deviceManagementDerivedCredentialNotificationType|**TODO: Add Description**. Possible values are: `none`, `companyPortal`, `email`.|



## Response

If successful, this method returns a `204 No Content` response code and a [deviceManagementDerivedCredentialSettings](../resources/intune-devicemanagementderivedcredentialsettings.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementderivedcredentialsettings_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/deviceManagement/derivedCredentials/$ref
Content-Type: application/json
Content-length: 191

{
  "@odata.type": "#microsoft.graph.deviceManagementDerivedCredentialSettings",
  "helpUrl": "String",
  "displayName": "String",
  "issuer": "String",
  "notificationType": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementDerivedCredentialSettings"
}
-->
``` http
HTTP/1.1 204 No Content

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.deviceManagementDerivedCredentialSettings",
  "id": "6df5eec5-eec5-6df5-c5ee-f56dc5eef56d",
  "helpUrl": "String",
  "displayName": "String",
  "issuer": "String",
  "notificationType": "String"
}
```

