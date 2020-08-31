/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_is_negative.c                                   :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: zmarth <marvin@42.fr>                      +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2020/08/14 18:41:09 by zmarth            #+#    #+#             */
/*   Updated: 2020/08/22 21:05:31 by zmarth           ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <unistd.h>
#include <stdio.h>
void	ft_putchar(char c)
{
	write(1, &c, 1);
}

void	ft_is_negative(int n)
{
	char a;
	char b;

	a = 'P';
	b = 'N';
	n = '0';
	if (n >= 0)
	{
		ft_putchar(a);
	}
	else
	{
		ft_putchar(b);
	}
}
