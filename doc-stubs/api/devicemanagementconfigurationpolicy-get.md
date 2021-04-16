---
title: "Get deviceManagementConfigurationPolicy"
description: "Read the properties and relationships of a deviceManagementConfigurationPolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get deviceManagementConfigurationPolicy
Namespace: microsoft.graph



Read the properties and relationships of a [deviceManagementConfigurationPolicy](../resources/devicemanagementconfigurationpolicy.md) object.

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
GET /deviceManagement/configurationPolicies/{deviceManagementConfigurationPolicyId}
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

If successful, this method returns a `200 OK` response code and a [deviceManagementConfigurationPolicy](../resources/devicemanagementconfigurationpolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_devicemanagementconfigurationpolicy"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/configurationPolicies/{deviceManagementConfigurationPolicyId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.deviceManagementConfigurationPolicy"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.deviceManagementConfigurationPolicy",
    "id": "f30bb6dc-b6dc-f30b-dcb6-0bf3dcb60bf3",
    "createdDateTime": "String (timestamp)",
    "creationSource": "String",
    "description": "String",
    "isAssigned": "Boolean",
    "lastModifiedDateTime": "String (timestamp)",
    "name": "String",
    "platforms": "String",
    "roleScopeTagIds": [
      "String"
    ],
    "settingCount": "Integer",
    "technologies": "String"
  }
}
```

