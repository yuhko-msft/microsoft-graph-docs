---
title: "Create credentialUserRegistrationDetails"
description: "Create a new credentialUserRegistrationDetails object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create credentialUserRegistrationDetails
Namespace: microsoft.graph



Create a new [credentialUserRegistrationDetails](../resources/credentialuserregistrationdetails.md) object.

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
POST /print/reports/credentialUserRegistrationDetails
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [credentialUserRegistrationDetails](../resources/credentialuserregistrationdetails.md) object.

The following table shows the properties that are required when you create the [credentialUserRegistrationDetails](../resources/credentialuserregistrationdetails.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|authMethods|registrationAuthMethod collection|**TODO: Add Description**. Possible values are: `email`, `mobilePhone`, `officePhone`, `securityQuestion`, `appNotification`, `appCode`, `alternateMobilePhone`, `fido`, `appPassword`, `unknownFutureValue`.|
|isCapable|Boolean|**TODO: Add Description**|
|isEnabled|Boolean|**TODO: Add Description**|
|isMfaRegistered|Boolean|**TODO: Add Description**|
|isRegistered|Boolean|**TODO: Add Description**|
|userDisplayName|String|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [credentialUserRegistrationDetails](../resources/credentialuserregistrationdetails.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_credentialuserregistrationdetails_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/print/reports/credentialUserRegistrationDetails
Content-Type: application/json
Content-length: 298

{
  "@odata.type": "#microsoft.graph.credentialUserRegistrationDetails",
  "authMethods": [
    "String"
  ],
  "isCapable": "Boolean",
  "isEnabled": "Boolean",
  "isMfaRegistered": "Boolean",
  "isRegistered": "Boolean",
  "userDisplayName": "String",
  "userPrincipalName": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.credentialUserRegistrationDetails"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.credentialUserRegistrationDetails",
  "id": "28646f9b-6f9b-2864-9b6f-64289b6f6428",
  "authMethods": [
    "String"
  ],
  "isCapable": "Boolean",
  "isEnabled": "Boolean",
  "isMfaRegistered": "Boolean",
  "isRegistered": "Boolean",
  "userDisplayName": "String",
  "userPrincipalName": "String"
}
```

