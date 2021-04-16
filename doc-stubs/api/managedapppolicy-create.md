---
title: "Create managedAppPolicy"
description: "Create a new managedAppPolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create managedAppPolicy
Namespace: microsoft.graph



Create a new [managedAppPolicy](../resources/managedapppolicy.md) object.

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
POST /deviceAppManagement/managedAppPolicies
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [managedAppPolicy](../resources/managedapppolicy.md) object.

The following table shows the properties that are required when you create the [managedAppPolicy](../resources/managedapppolicy.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|The date and time the policy was created.|
|description|String|The policy's description.|
|displayName|String|Policy display name.|
|lastModifiedDateTime|DateTimeOffset|Last time the policy was modified.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance.|
|version|String|Version of the entity.|



## Response

If successful, this method returns a `201 Created` response code and a [managedAppPolicy](../resources/managedapppolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_managedapppolicy_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceAppManagement/managedAppPolicies
Content-Type: application/json
Content-length: 182

{
  "@odata.type": "#microsoft.graph.managedAppPolicy",
  "description": "String",
  "displayName": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.managedAppPolicy"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.managedAppPolicy",
  "id": "163f5e52-5e52-163f-525e-3f16525e3f16",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "String"
}
```

