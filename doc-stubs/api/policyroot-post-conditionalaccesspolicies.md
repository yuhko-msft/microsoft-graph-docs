---
title: "Create conditionalAccessPolicy"
description: "Create a new conditionalAccessPolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create conditionalAccessPolicy
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new conditionalAccessPolicy object.

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
POST /policyRoot/conditionalAccessPolicies
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [conditionalAccessPolicy](../resources/conditionalaccesspolicy.md) object.

The following table shows the properties that are required when you create the [conditionalAccessPolicy](../resources/conditionalaccesspolicy.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description**|
|createdDateTime|DateTimeOffset|**TODO: Add Description**|
|modifiedDateTime|DateTimeOffset|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|state|conditionalAccessPolicyState|**TODO: Add Description**. Possible values are: `enabled`, `disabled`, `enabledForReportingButNotEnforced`.|
|conditions|[Microsoft.IdentityProtectionServices.conditionalAccessConditionSet](../resources/conditionalaccessconditionset.md)|**TODO: Add Description**|
|grantControls|[Microsoft.IdentityProtectionServices.conditionalAccessGrantControls](../resources/conditionalaccessgrantcontrols.md)|**TODO: Add Description**|
|sessionControls|[Microsoft.IdentityProtectionServices.conditionalAccessSessionControls](../resources/conditionalaccesssessioncontrols.md)|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [conditionalAccessPolicy](../resources/conditionalaccesspolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_conditionalaccesspolicy_from_conditionalaccesspolicies"
}
-->
``` http
POST https://graph.microsoft.com/beta/policyRoot/conditionalAccessPolicies
Content-Type: application/json
Content-length: 455

{
  "@odata.type": "#Microsoft.IdentityProtectionServices.conditionalAccessPolicy",
  "displayName": "String",
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
  "truncated": true,
  "@odata.type": "Microsoft.IdentityProtectionServices.conditionalAccessPolicy"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.IdentityProtectionServices.conditionalAccessPolicy",
  "id": "3947b73c-b73c-3947-3cb7-47393cb74739",
  "createdDateTime": "String (timestamp)",
  "modifiedDateTime": "String (timestamp)",
  "displayName": "String",
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

