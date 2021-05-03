---
title: "Microsoft Graph for eDiscovery Tutorial"
description: "Learn how to use the Microsoft Graph to enable eDiscovery workflows in your organization"
localization_priority: Normal
author: mahage-msft
---

<!-- snippet-enable eDiscovery.Read.All eDiscovery.ReadWrite.All Sites.Read.All -->

<!--
NOTES:

This is the example we're shooting for
https://review.docs.microsoft.com/en-us/graph/recipes/work-with-users?branch=jasonjoh-recipes&tabs=http

This is a sample of full code that Jasonjoh linked to at the bottom of his article
https://github.com/microsoftgraph/microsoft-graph-docs/blob/jasonjoh-recipes/concepts/recipes/src/work-with-users.cs

Usage - .\SnippetGen.exe generate -d '..\Tutorial\' -t '.\templates\'
-->

# Microsoft Graph for eDiscovery Tutorial

# Overview

The eDiscovery APIs in Microsoft Graph provide access to commonly used features in the Advanced eDiscovery suite. The Microsoft Graph can be used to automate redundant tasks, integrate with third-party tools, and build custom reporting.

This tutorial teaches you how to build a .NET Core console app that uses the Microsoft Graph API to execute many common tasks in [Microsoft 365 Advanced eDiscovery](https://aka.ms/edisco).

# Prerequisites

You must have Microsoft work or school account with [eDiscovery Manager or eDiscovery administrator permissions](https://docs.microsoft.com/microsoft-365/compliance/assign-ediscovery-permissions). If you don't have a Microsoft account you would like to get one for development purposes, you can sign up for the [Microsoft 365 Developer Program](https://developer.microsoft.com/microsoft-365/dev-program) to get a free sandbox, tools, and other resources.

## Choose an SDK and development environment

This tutorial contains samples for different languages, to get started, review [Microsoft Graph SDKs overview](https://docs.microsoft.com/graph/sdks/sdks-overview).  The HTTP examples can be run directly in the [Microsoft Graph Explorer](https://developer.microsoft.com/graph/graph-explorer).

## Create an Azure Active Directory app

If you plan on building a application, the application will need to be registered in the Azure Active Directory.  See [Create an Azure Active Directory app to use with the Microsoft Graph Toolkit
](https://docs.microsoft.com/graph/toolkit/get-started/add-aad-app-registration).  This step is not required if you are just using the [Microsoft Graph Explorer](https://developer.microsoft.com/graph/graph-explorer).

The [Microsoft Graph Tutorials](https://docs.microsoft.com/graph/tutorials) provides a number of getting started guides to help you understand and build an application for your preferred platform.

## Required permissions

Any application that provisions users will need write access to Azure Active Directory. If the application will be performing these actions as a user (using delegated authentication), that user will need to be an administrator. Alternatively, permissions can be granted to the application directly (using application authentication), allowing it to provision users without an authenticated user.

The Microsoft Graph APIs used in this article require the following permissions.

| Actions                                    | Permission               |
|--------------------------------------------------------------|--------------------------|
| Read, create and modify eDiscovery objects                   | eDiscovery.ReadWrite.All |
| Read eDiscovery objects (may be used for some of the APIs)   | eDiscovery.Read.All      |
| Read site information                                        | Sites.Read.All           |
| Read group information                                       | Groups.Read.All          |

<!-- Everything above here should be good to go - Need to start building out each of the samples and pull the samples from the graph docs -->

## Create a case

In this section you will create a new eDiscovery case.

### Request

# [HTTP](#tab/http)

<!-- {
  "saveResultVariable": {
    "name": "newUser",
    "type": "user"
  },
  "snippetName": "CreateUser"
} -->

```http
POST https://graph.microsoft.com/beta/compliance/ediscovery/cases
Content-Type: application/json

{
    "displayName": "eDiscovery Graph Tutorial"
}
```

# [C#](#tab/CS)

:::code language="csharp" source="src/ediscovery-graph-tutorial.cs" id="CreateUserSnippet":::

# [JavaScript](#tab/javascript)

:::code language="javascript" source="src/ediscovery-graph-tutorial.js" id="CreateUserSnippet":::

# [Java](#tab/java)

:::code language="java" source="src/ediscovery-graph-tutorial.java" id="CreateUserSnippet":::

---

# List eDiscovery cases

# Add custodians to a case
