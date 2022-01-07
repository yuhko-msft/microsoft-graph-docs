---
title: "Update conditionalAccessPolicy"
description: "Update the properties of a conditionalAccessPolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update conditionalAccessPolicy
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Update the properties of a [conditionalAccessPolicy](../resources/conditionalaccesspolicy.md) object.

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
PATCH /conditionalAccess/policies/{conditionalAccessPolicyId}
PATCH /policyRoot/conditionalAccessPolicies/{conditionalAccessPolicyId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
[!INCLUDE [table-intro](../../includes/update-property-table-intro.md)]


|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|modifiedDateTime|DateTimeOffset|**TODO: Add Description** Optional.|
|displayName|String|**TODO: Add Description** Required.|
|templateId|String|**TODO: Add Description** Optional.|
|description|String|**TODO: Add Description** Optional.|
|state|conditionalAccessPolicyState|**TODO: Add Description**. The possible values are: `enabled`, `disabled`, `enabledForReportingButNotEnforced`. Required.|
|conditions|[Microsoft.IdentityProtectionServices.conditionalAccessConditionSet](../resources/conditionalaccessconditionset.md)|**TODO: Add Description** Required.|
|grantControls|[Microsoft.IdentityProtectionServices.conditionalAccessGrantControls](../resources/conditionalaccessgrantcontrols.md)|**TODO: Add Description** Optional.|
|sessionControls|[Microsoft.IdentityProtectionServices.conditionalAccessSessionControls](../resources/conditionalaccesssessioncontrols.md)|**TODO: Add Description** Optional.|



## Response

If successful, this method returns a `200 OK` response code and an updated [conditionalAccessPolicy](../resources/conditionalaccesspolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_conditionalaccesspolicy"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/conditionalAccess/policies/{conditionalAccessPolicyId}
Content-Type: application/json
Content-length: 461

{
  "@odata.type": "#microsoft.graph.conditionalAccessPolicy",
  "displayName": "String",
  "templateId": "String",
  "description": "String",
  "state": "String",
  "conditions": {
    "@odata.type": "microsoft.graph.conditionalAccessConditionSet"
  },
  "grantControls": {
    "@odata.type": "microsoft.graph.conditionalAccessGrantControls"
  },
  "sessionControls": {
    "@odata.type": "microsoft.graph.conditionalAccessSessionControls"
  }
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.conditionalAccessPolicy",
  "id": "aa86e4ea-e4ea-aa86-eae4-86aaeae486aa",
  "createdDateTime": "String (timestamp)",
  "modifiedDateTime": "String (timestamp)",
  "displayName": "String",
  "templateId": "String",
  "description": "String",
  "state": "String",
  "conditions": {
    "@odata.type": "microsoft.graph.conditionalAccessConditionSet"
  },
  "grantControls": {
    "@odata.type": "microsoft.graph.conditionalAccessGrantControls"
  },
  "sessionControls": {
    "@odata.type": "microsoft.graph.conditionalAccessSessionControls"
  }
}
```

