---
title: "Add deviceManagementDerivedCredentialSettings"
description: "Add derivedCredentialSettings by posting to the derivedCredentialSettings collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add deviceManagementDerivedCredentialSettings
Namespace: microsoft.graph



Add derivedCredentialSettings by posting to the derivedCredentialSettings collection.

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
POST ** Collection URI for microsoft.graph.deviceManagementDerivedCredentialSettings not found/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [deviceManagementDerivedCredentialSettings](../resources/devicemanagementderivedcredentialsettings.md) object.

The following table shows the properties that are required when you create the [deviceManagementDerivedCredentialSettings](../resources/devicemanagementderivedcredentialsettings.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|The display name for the profile.|
|helpUrl|String|The URL that will be accessible to end users as they retrieve a derived credential using the Company Portal.|
|issuer|deviceManagementDerivedCredentialIssuer|The derived credential provider to use. Possible values are: `intercede`, `entrustDatacard`, `purebred`, `xTec`.|
|notificationType|deviceManagementDerivedCredentialNotificationType|The methods used to inform the end user to open Company Portal to deliver Wi-Fi, VPN, or email profiles that use certificates to the device. Possible values are: `none`, `companyPortal`, `email`.|



## Response

If successful, this method returns a `204 No Content` response code and a [deviceManagementDerivedCredentialSettings](../resources/devicemanagementderivedcredentialsettings.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_devicemanagementderivedcredentialsettings_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.deviceManagementDerivedCredentialSettings not found/$ref
Content-Type: application/json
Content-length: 191

{
  "@odata.type": "#microsoft.graph.deviceManagementDerivedCredentialSettings",
  "displayName": "String",
  "helpUrl": "String",
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
  "id": "2f43e89a-e89a-2f43-9ae8-432f9ae8432f",
  "displayName": "String",
  "helpUrl": "String",
  "issuer": "String",
  "notificationType": "String"
}
```

