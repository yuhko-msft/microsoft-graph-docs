---
title: "List compliancePolicies"
description: "Get the deviceManagementCompliancePolicy resources from the compliancePolicies navigation property."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List compliancePolicies
Namespace: microsoft.graph

Get the deviceManagementCompliancePolicy resources from the compliancePolicies navigation property.

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
GET /deviceManagement/compliancePolicies
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

If successful, this method returns a `200 OK` response code and a collection of [deviceManagementCompliancePolicy](../resources/devicemanagementcompliancepolicy.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_devicemanagementcompliancepolicy"
}
-->
``` http
GET https://graph.microsoft.com/beta/deviceManagement/compliancePolicies
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.deviceManagementCompliancePolicy)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.deviceManagementCompliancePolicy",
      "id": "d885f130-f130-d885-30f1-85d830f185d8",
      "name": "String",
      "description": "String",
      "platforms": "String",
      "technologies": "String",
      "createdDateTime": "String (timestamp)",
      "lastModifiedDateTime": "String (timestamp)",
      "settingCount": "Integer",
      "creationSource": "String",
      "roleScopeTagIds": [
        "String"
      ],
      "isAssigned": "Boolean",
      "templateReference": {
        "@odata.type": "microsoft.graph.deviceManagementConfigurationPolicyTemplateReference"
      }
    }
  ]
}
```

