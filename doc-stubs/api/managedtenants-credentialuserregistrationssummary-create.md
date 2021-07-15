---
title: "Create credentialUserRegistrationsSummary"
description: "Create a new credentialUserRegistrationsSummary object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create credentialUserRegistrationsSummary
Namespace: microsoft.graph.managedTenants

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new [credentialUserRegistrationsSummary](../resources/managedtenants-credentialuserregistrationssummary.md) object.

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
POST /tenantRelationships/managedTenants/credentialUserRegistrationsSummaries
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [credentialUserRegistrationsSummary](../resources/managedtenants-credentialuserregistrationssummary.md) object.

The following table shows the properties that are required when you create the [credentialUserRegistrationsSummary](../resources/managedtenants-credentialuserregistrationssummary.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/managedtenants-entity.md)|
|lastRefreshedDateTime|DateTimeOffset|**TODO: Add Description**|
|mfaAndSsprCapableUserCount|Int32|**TODO: Add Description**|
|mfaConditionalAccessPolicyState|String|**TODO: Add Description**|
|mfaRegisteredUserCount|Int32|**TODO: Add Description**|
|securityDefaultsEnabled|Boolean|**TODO: Add Description**|
|ssprEnabledUserCount|Int32|**TODO: Add Description**|
|ssprRegisteredUserCount|Int32|**TODO: Add Description**|
|tenantDisplayName|String|**TODO: Add Description**|
|tenantId|String|**TODO: Add Description**|
|totalUserCount|Int32|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [credentialUserRegistrationsSummary](../resources/managedtenants-credentialuserregistrationssummary.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_credentialuserregistrationssummary_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/tenantRelationships/managedTenants/credentialUserRegistrationsSummaries
Content-Type: application/json
Content-length: 484

{
  "@odata.type": "#microsoft.graph.managedTenants.credentialUserRegistrationsSummary",
  "lastRefreshedDateTime": "String (timestamp)",
  "mfaAndSsprCapableUserCount": "Integer",
  "mfaConditionalAccessPolicyState": "String",
  "mfaRegisteredUserCount": "Integer",
  "securityDefaultsEnabled": "Boolean",
  "ssprEnabledUserCount": "Integer",
  "ssprRegisteredUserCount": "Integer",
  "tenantDisplayName": "String",
  "tenantId": "String",
  "totalUserCount": "Integer"
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.managedTenants.credentialUserRegistrationsSummary"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.managedTenants.credentialUserRegistrationsSummary",
  "id": "fb9586ff-86ff-fb95-ff86-95fbff8695fb",
  "lastRefreshedDateTime": "String (timestamp)",
  "mfaAndSsprCapableUserCount": "Integer",
  "mfaConditionalAccessPolicyState": "String",
  "mfaRegisteredUserCount": "Integer",
  "securityDefaultsEnabled": "Boolean",
  "ssprEnabledUserCount": "Integer",
  "ssprRegisteredUserCount": "Integer",
  "tenantDisplayName": "String",
  "tenantId": "String",
  "totalUserCount": "Integer"
}
```

